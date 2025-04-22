package com.devfalco.events.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfalco.events.domain.coupon.Coupon;
import com.devfalco.events.domain.coupon.CouponRequestDTO;
import com.devfalco.events.domain.event.Event;
import com.devfalco.events.repositories.CouponRepository;
import com.devfalco.events.repositories.EventRepository;

@Service
public class CouponService {
  @Autowired
  CouponRepository couponRepository;

  @Autowired
  private EventRepository eventRepository;

  public Coupon addCouponsToEvent(UUID eventId, CouponRequestDTO couponData){

    Event event = eventRepository.findById(eventId).orElseThrow(() -> new IllegalArgumentException("Event not found"));
     
    Coupon newCoupon = new Coupon();
      newCoupon.setCode(couponData.code());
      newCoupon.setValid(new Date(couponData.valid()));
      newCoupon.setDiscount(couponData.discount());
      newCoupon.setEvent(event);

      
      return couponRepository.save(newCoupon);

       
  }

  public List<Coupon> consultCoupons(UUID eventId, Date currenDate){
    return couponRepository.findByEventIdAndValidAfter(eventId,currenDate);
  }
}
