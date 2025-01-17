package com.mapStructDemo.service;

import com.mapStructDemo.dto.StudentDto;
import com.mapStructDemo.entity.Student;

import java.util.List;

public interface StudentService {

    List<StudentDto> fetchAllStudents();
    Student addStudent(StudentDto studentDto);


}

