package com.letscode.sortinghat.controllers;

import com.letscode.sortinghat.payloads.StudentInfoResponse;
import com.letscode.sortinghat.payloads.StudentRequest;
import com.letscode.sortinghat.payloads.StudentResponse;
import com.letscode.sortinghat.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

  @Autowired
  StudentService studentService;

  @PostMapping
  public StudentResponse create(@RequestBody StudentRequest studentRequest) {
    return studentService.create(studentRequest);
  }

  @GetMapping("/{id}")
  public StudentInfoResponse getById(@PathVariable Integer id) {
    return studentService.getById(id);
  }
}
