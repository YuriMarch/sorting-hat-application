package com.letscode.sortinghat.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class StudentRequest {
  private String name;
  private String grade;
}
