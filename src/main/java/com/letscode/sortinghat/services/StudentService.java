package com.letscode.sortinghat.services;

import com.letscode.sortinghat.payloads.StudentInfoResponse;
import com.letscode.sortinghat.payloads.StudentRequest;
import com.letscode.sortinghat.payloads.StudentResponse;

public interface StudentService {

  StudentInfoResponse getById(Integer id);
   StudentResponse create(StudentRequest studentRequest);
}
