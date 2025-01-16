package com.mapStructDemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
@Table(name="student_tbl")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String rollNumber;
    private String city;
    private Date creationDate;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student() {
    }

    public Student(Integer id, String firstName, String lastName, String rollNumber, String city, Date creationDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.city = city;
        this.creationDate = creationDate;
    }

}
