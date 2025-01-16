package com.mapStructDemo.serviceImpl;

import com.mapStructDemo.dto.StudentDto;
import com.mapStructDemo.entity.Student;
import com.mapStructDemo.mapper.StudentPopulator;
import com.mapStructDemo.repository.StudentRepository;
import com.mapStructDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentDto> fetchAllStudents() {
        List<Student> all = this.studentRepository.findAll();
        List<StudentDto> studentDtoList = new ArrayList<>();
        for(Student s :all){
            StudentDto studentDto = StudentPopulator.INSTANCE.populateStudentDto(s);
            studentDtoList.add(studentDto);
        }
        return studentDtoList;
    }

    @Override
    public Student addStudent(StudentDto studentDto) {
//        Student student = new Student();
////        student.setId(1);
//        student.setFirstName("Amol");
//        student.setLastName("Khot");
//        student.setRollNumber("F116797");
//        student.setCreationDate(new Date());

        System.out.println(studentDto);
        Student student = StudentPopulator.INSTANCE.populateStudent(studentDto);
        System.out.println(student);
        student.setCreationDate(new Date());
        return this.studentRepository.save(student);

    }
}
