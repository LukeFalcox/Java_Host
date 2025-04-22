package com.devfalco.events.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;
import com.devfalco.events.domain.coupon.Coupon;
import com.devfalco.events.domain.event.Event;
import com.devfalco.events.domain.event.EventDetailsDTO;
import com.devfalco.events.domain.event.EventRequestDTO;
import com.devfalco.events.domain.event.EventResponseDTO;
import com.devfalco.events.repositories.EventRepository;

@Service
public class EventService {

  @Value("${aws.bucket.name}")
  private String bucketName;

    @Autowired
    private AmazonS3 s3Client;

    @Autowired
    private EventRepository repository;

    @Autowired
    private AddressService addressService;

    @Autowired
    private CouponService couponService;

  public Event createEvent(EventRequestDTO data){
    String imgUrl = null;

    if (data.image() != null) {
      imgUrl = this.uploadImg(data.image());
    }

    Event newEvent = new Event();
    newEvent.setTitle(data.title());
    newEvent.setDescription(data.description());
    newEvent.setEventUrl(data.eventUrl());
    newEvent.setDate(new Date(data.date()));
    newEvent.setImgUrl(imgUrl);
    newEvent.setRemote(data.remote());

    repository.save(newEvent);

    if (!data.remote()) {
      this.addressService.creatAddress(data, newEvent);
    }

    return newEvent;
  }

  public List<EventResponseDTO> getUpComingEvents(int page, int size){
    Pageable pageable = PageRequest.of(page, size);
    Page<Event> eventsPage = this.repository.findUpcomingEvents(new Date(), pageable);
    return eventsPage.map(event -> new EventResponseDTO(event.getId(),event.getTitle(),event.getDescription(),event.getDate(),
    event.getAddress() != null ? event.getAddress().getCity():"",
    event.getAddress() != null ? event.getAddress().getUf():"",event.getEventUrl(),event.getImgUrl(),event.getRemote())).stream().toList();
  }
  public List<EventResponseDTO> getFilteredEvents(int page, int size, String title, String city, String uf, Date startDate,Date endDate){
    Pageable pageable = PageRequest.of(page, size);
    Page<Event> eventsPage = this.repository.findFilteredEvents(new Date(), title,city,uf,startDate,endDate,pageable);
    return eventsPage.map(event -> new EventResponseDTO(event.getId(),
    event.getTitle(),
    event.getDescription(),
    event.getDate(),
    event.getAddress() != null ? event.getAddress().getCity():"",
    event.getAddress() != null ? event.getAddress().getUf():"",
    event.getEventUrl(),
    event.getImgUrl(),
    event.getRemote())).stream().toList();
  }

  public EventDetailsDTO getEventDetails(UUID eventId){
    Event event = repository.findById(eventId).orElseThrow(() -> new IllegalArgumentException("Event not found"));

    List<Coupon> coupons = couponService.consultCoupons(eventId, new Date());

    List<EventDetailsDTO.CouponDTO> couponDTOs = coupons.stream()
    .map(coupon -> new EventDetailsDTO.CouponDTO(
      coupon.getCode(),
      coupon.getDiscount(),
      coupon.getValid()
    )).collect(Collectors.toList());

    return new EventDetailsDTO(
      event.getId(),
      event.getTitle(),
      event.getDescription(),
      event.getDate(),
      event.getAddress() != null ? event.getAddress().getCity() : "",
      event.getAddress() != null ? event.getAddress().getUf() : "",
      event.getImgUrl(),
      event.getEventUrl(),
      couponDTOs
    );
  }

  public List<EventResponseDTO> getEvents(int page, int size){
    Pageable pageable = PageRequest.of(page, size);
    Page<Event> eventsPage = this.repository.findAll(pageable);
    return eventsPage.map(event -> new EventResponseDTO(event.getId(),event.getTitle(),event.getDescription(),event.getDate(),
    event.getAddress() != null ? event.getAddress().getCity():"",
    event.getAddress() != null ? event.getAddress().getUf():"",event.getEventUrl(),event.getImgUrl(),event.getRemote())).stream().toList();
  }


  private String uploadImg(MultipartFile multipartFile){
    String fileName = UUID.randomUUID() + "-" + multipartFile.getOriginalFilename();

    try {
      File file = this.convertMultipartToFile(multipartFile);
      s3Client.putObject(bucketName,fileName, file);
      file.delete();
      return s3Client.getUrl(bucketName,fileName).toString();
    } catch (Exception e) {
      System.out.println("erro ao subir arquivo");
      return "";
    }
  }

  private File convertMultipartToFile(MultipartFile multipartFile) throws IOException{
    File convFile = new File(Objects.requireNonNull(multipartFile.getOriginalFilename()));
    FileOutputStream fos = new FileOutputStream(convFile);
    fos.write(multipartFile.getBytes());
    fos.close();
    return convFile;
  }
}
