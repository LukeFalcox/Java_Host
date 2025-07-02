package com.devfalco.RespostNow.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="school")

public class School {
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  Integer id;
  String name;
  String city;
  String state;
}
