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
@Table(name="favoritequestion")

public class FavoriteQuestion {
  Integer id;
  Integer student_id;
  Integer question_id;
}
