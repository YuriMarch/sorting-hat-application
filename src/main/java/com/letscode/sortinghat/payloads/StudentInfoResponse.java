package com.letscode.sortinghat.payloads;

import com.letscode.sortinghat.models.Student;
import com.letscode.sortinghat.payloads.entities.House;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class StudentInfoResponse {
  private Integer id;
  private String name;
  private String grade;
  private String sortingHatKey;
  private House house;

  public StudentInfoResponse(Student student, House house) {
    this.id = student.getId();
    this.name = student.getName();
    this.grade = student.getGrade();
    this.sortingHatKey = student.getSortingHatKey();
    this.house = house;
  }
}
