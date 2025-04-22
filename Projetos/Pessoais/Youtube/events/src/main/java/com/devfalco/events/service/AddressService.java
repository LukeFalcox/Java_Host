package com.devfalco.events.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfalco.events.domain.address.Address;
import com.devfalco.events.domain.event.Event;
import com.devfalco.events.domain.event.EventRequestDTO;
import com.devfalco.events.repositories.AddressRepository;

@Service
public class AddressService {
  @Autowired
  private AddressRepository addressRepository;

  public Address creatAddress(EventRequestDTO data, Event event){
    Address newAddress = new Address();
    newAddress.setCity(data.city());
    newAddress.setUf(data.state());
    newAddress.setEvent(event);

    return addressRepository.save(newAddress);
  }
  
}