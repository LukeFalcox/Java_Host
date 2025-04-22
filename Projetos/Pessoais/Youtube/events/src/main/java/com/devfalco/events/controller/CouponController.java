package com.devfalco.events.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devfalco.events.domain.coupon.Coupon;
import com.devfalco.events.domain.coupon.CouponRequestDTO;
import com.devfalco.events.service.CouponService;

@RestController
@RequestMapping("/api/coupon")
public class CouponController {
 
  @Autowired
  private CouponService couponService;


  @PostMapping("/event/{eventId}")
  public ResponseEntity<Coupon> addCouponsToEvent(@PathVariable UUID eventId, @RequestBody CouponRequestDTO data){
    Coupon coupon = couponService.addCouponsToEvent(eventId,data);
    return ResponseEntity.ok(coupon);
  }
}
