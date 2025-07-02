package com.devfalco.RespostNow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="student")
@Entity
public class Student {
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Id
  Integer id;
  String username;
  String email;
  String confirmPassword;
  String password;
  STATUS status;
}