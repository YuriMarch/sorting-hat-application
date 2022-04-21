package com.letscode.sortinghat.services.impl;

import com.letscode.sortinghat.clients.GetHouse;
import com.letscode.sortinghat.clients.GetSortingHatKey;
import com.letscode.sortinghat.models.Student;
import com.letscode.sortinghat.payloads.StudentInfoResponse;
import com.letscode.sortinghat.payloads.StudentRequest;
import com.letscode.sortinghat.payloads.StudentResponse;
import com.letscode.sortinghat.payloads.entities.House;
import com.letscode.sortinghat.repositories.StudentRepository;
import com.letscode.sortinghat.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

  @Autowired
  private StudentRepository studentRepository;

  @Autowired
  private GetHouse getHouse;

  @Autowired
  private GetSortingHatKey getSortingHatKey;

  @Override
  public StudentResponse create(StudentRequest studentRequest) {
    Student student = new Student();
    student.setName(studentRequest.getName());
    student.setGrade(studentRequest.getGrade());
    student.setSortingHatKey(getSortingHatKey.execute().getSortingHatKey());
    studentRepository.save(student);
    StudentResponse studentResponse = new StudentResponse(student);

    return studentResponse;
  }

  @Override
  public StudentInfoResponse getById(Integer id){
    Student student = studentRepository.findById(id).orElseThrow();
    String houseKey = student.getSortingHatKey();
    House house = getHouse.execute(houseKey);

    StudentInfoResponse studentInfoResponse = new StudentInfoResponse(student, house);

    return studentInfoResponse;
  }
}
