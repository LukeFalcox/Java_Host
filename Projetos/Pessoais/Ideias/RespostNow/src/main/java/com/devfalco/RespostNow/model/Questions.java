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
@Table(name="questions")

public class Questions {
  Integer id;
  String title; 
  String answer;
  Integer tests_id;
  String option_a;
  String option_b;
  String option_c;
  String option_d;
  String correct_option;
  String explanation; 

}
