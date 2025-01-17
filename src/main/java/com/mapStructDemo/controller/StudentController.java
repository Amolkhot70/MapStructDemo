package com.mapStructDemo.controller;

import com.mapStructDemo.dto.StudentDto;
import com.mapStructDemo.entity.Student;
import com.mapStructDemo.mapper.StudentPopulator;
import com.mapStructDemo.service.StudentService;
import com.mapStructDemo.validator.UpdateValidationGroup;
import jakarta.validation.Valid;
import jakarta.validation.groups.Default;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@Validated({Default.class,UpdateValidationGroup.class}) @RequestBody StudentDto studentDto){
        Student student = this.studentService.addStudent(studentDto);
        return new ResponseEntity<>(student,HttpStatus.CREATED);
    }


    @GetMapping("/getAll")
    public ResponseEntity<List<StudentDto>> fetchAllStudents(){
        List<StudentDto> studentDtoList = this.studentService.fetchAllStudents();
        return new ResponseEntity<>(studentDtoList, HttpStatus.OK);
    }

}
