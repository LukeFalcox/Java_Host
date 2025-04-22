package com.devfalco.events.domain.address;
import java.util.Date;
import java.util.UUID;

import com.devfalco.events.domain.event.Event;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table( name = "address")
@Setter
@Getter 
@AllArgsConstructor
@NoArgsConstructor
public class Address {
  @Id
  @GeneratedValue
  private UUID id;

  private String city;
  private String uf;

  @ManyToOne
  @JoinColumn(name  = "event_id")
  private Event event;
}
