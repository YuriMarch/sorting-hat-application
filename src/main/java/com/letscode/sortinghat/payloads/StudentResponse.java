package com.letscode.sortinghat.payloads;

import com.letscode.sortinghat.models.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudentResponse {
  private Integer id;
  private String name;
  private String grade;
  private String sortingHatKey;

  public StudentResponse(Student student) {
    this.id = student.getId();
    this.name = student.getName();
    this.grade = student.getGrade();
    this.sortingHatKey = student.getSortingHatKey();
  }
}
