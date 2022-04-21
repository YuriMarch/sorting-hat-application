package com.letscode.sortinghat.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StudentRequest {
  private String name;
  private String grade;
}
