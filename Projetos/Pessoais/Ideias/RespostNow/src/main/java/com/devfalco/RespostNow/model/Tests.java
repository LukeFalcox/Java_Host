package com.devfalco.RespostNow.model;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="tests")
public class Tests {
  Integer id;
  String title;
  String description;
  String student_id;
  String year;
  String grade;
  String subject;
  String school_id;
}
