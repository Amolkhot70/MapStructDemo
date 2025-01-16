package com.mapStructDemo.mapper;

import com.mapStructDemo.dto.StudentDto;
import com.mapStructDemo.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentPopulator {

    StudentPopulator INSTANCE= Mappers.getMapper(StudentPopulator.class);

   @Mappings({
           @Mapping(target = "id",ignore = true),
           @Mapping(target = "creationDate",ignore = true),
           @Mapping(target = "city",source = "landMark")
   })
    Student populateStudent(StudentDto studentDto);

    StudentDto populateStudentDto(Student student);


}
