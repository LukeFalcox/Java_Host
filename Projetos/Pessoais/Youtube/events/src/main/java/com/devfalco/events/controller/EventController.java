package com.devfalco.events.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.devfalco.events.domain.event.Event;
import com.devfalco.events.domain.event.EventDetailsDTO;
import com.devfalco.events.domain.event.EventRequestDTO;
import com.devfalco.events.domain.event.EventResponseDTO;
import com.devfalco.events.service.EventService;

@RestController
@RequestMapping("/api/event")
public class EventController {
  @Autowired
  private EventService eventService;

    @PostMapping(consumes = "multipart/form-data")
  public ResponseEntity<Event> create(@RequestParam("title") String title,
  @RequestParam(value = "description", required = false) String description,
  @RequestParam("date") Long date,
  @RequestParam("city") String city,
  @RequestParam("state") String state,
  @RequestParam("remote") Boolean remote,
  @RequestParam("eventUrl") String eventUrl,
  @RequestParam(value = "image", required = false) MultipartFile image
  
  
  ){
    EventRequestDTO eventRequestDTO = new EventRequestDTO(title, description, date, city, state, eventUrl, image,remote);
    Event newEvent = this.eventService.createEvent(eventRequestDTO);
    return ResponseEntity.ok(newEvent);
  }

  @GetMapping("/{eventId}")
  public ResponseEntity<EventDetailsDTO> getEventDetails(@PathVariable UUID eventId){
    EventDetailsDTO allEvents = this.eventService.getEventDetails(eventId);
    return ResponseEntity.ok(allEvents);
  }


    @GetMapping
  public ResponseEntity<List<EventResponseDTO>> getEvents(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
    List<EventResponseDTO> allEvents = this.eventService.getUpComingEvents(page,size);
    return ResponseEntity.ok(allEvents);
  }

  @GetMapping("/filter")
  public ResponseEntity<List<EventResponseDTO>> filterEvents(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size,
   String title,
   String city,
   String uf,
   Date startDate,
   Date endDate){
    title = (title !=null) ? title : "";
    city = (city !=null) ? city : "";
    uf = (uf !=null) ? uf : "";
    startDate = (startDate !=null) ? startDate : new Date(0);
    endDate = (endDate !=null) ? endDate : new Date();

    List<EventResponseDTO> events = this.eventService.getFilteredEvents(page,size,title,city,uf,startDate,endDate);
    return ResponseEntity.ok(events);
  }
}
