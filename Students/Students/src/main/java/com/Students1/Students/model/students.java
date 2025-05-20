package com.Students1.Students.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "student_table")
public class students {
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    
    private long studentId;
    @NotEmpty
    private String studentName;
    @Email
    private String studentEmail;
    private String studentPlace;
    @Min(10)
    @Max(30)
    private int studentAge;

    public students() {
    }

    public students(long studentId, @NotEmpty String studentName, @Email String studentEmail, String studentPlace,
            int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentPlace = studentPlace;
        this.studentAge = studentAge;
    }
    public long getStudentId() {
        return studentId;
    }
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentEmail() {
        return studentEmail;
    }
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public String getStudentPlace() {
        return studentPlace;
    }
    public void setStudentPlace(String studentPlace) {
        this.studentPlace = studentPlace;
    }
    public int getStudentAge() {
        return studentAge;
    }
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}

    
  