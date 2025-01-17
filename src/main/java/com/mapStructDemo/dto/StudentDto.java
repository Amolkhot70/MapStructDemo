package com.mapStructDemo.dto;


import com.mapStructDemo.validator.UniqueEmailValidator;
import com.mapStructDemo.validator.UpdateValidationGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class StudentDto {

    @NotBlank(message = "firstName should not be empty or blank")
    private String firstName;

    @NotBlank(message = "lastName should not be empty or blank")
    private String lastName;

    @Min(value =0,message = "minimum rollNumber should be 0")
    @Max(value =100,message = "maximum rollNumber should be 100")
    private String rollNumber;

    @NotBlank(message = "landMark should not be empty or blank")
    private String landMark;

    @UniqueEmailValidator(message = "Email must be unique",groups = {UpdateValidationGroup.class}) //custom Annotation created for validation
    @NotBlank(message = "emailId should not be empty or blank")
    private String emailId;

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

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public StudentDto() {
    }

    public StudentDto(String firstName, String lastName, String rollNumber, String landMark, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.landMark = landMark;
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", landMark='" + landMark + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
