package com.mapStructDemo.dto;


public class StudentDto {
    private String firstName;
    private String lastName;
    private String rollNumber;
    private String landMark;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
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

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public StudentDto() {
    }

    public StudentDto(String firstName, String lastName, String rollNumber, String landMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.landMark = landMark;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", landMark='" + landMark + '\'' +
                '}';
    }

}
