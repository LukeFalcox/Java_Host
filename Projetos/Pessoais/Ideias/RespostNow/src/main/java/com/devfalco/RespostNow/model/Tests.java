package com.devfalco.RespostNow.model;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="tests")
public class Tests {
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  Integer id;
  String title;
  String description;
  String student_id;
  String year;
  String grade;
  String subject;
  String school_id;
}
