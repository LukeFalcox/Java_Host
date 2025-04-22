package com.devfalco.events.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfalco.events.domain.address.Address;

public interface AddressRepository extends JpaRepository<Address,UUID> {
  
}
