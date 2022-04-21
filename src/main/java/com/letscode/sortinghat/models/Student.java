package com.letscode.sortinghat.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "students")
@Entity
@Getter @Setter
@NoArgsConstructor
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name")
  private String name;

  @Column(name = "sorting_hat_key")
  private String sortingHatKey;

  @Column(name = "grade")
  private String grade;
}
