package com.Students1.Students.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Students1.Students.Repository.studentRepository;
import com.Students1.Students.model.students;

@Service
public class studentservice {
    
    @Autowired
    private studentRepository repository;
    //Insert a new data
    public void createStudent(students students){
        repository.save(students);
    }
    //Fetches all

    public List<students> getAllStudents(){
        return repository.findAll();
    }
    //Fetches studentt By Id
    public Optional<students>getStudentById(Long id){
        return repository.findById(id);
    }
    //update table
    public void updateStudent(students students){
        repository.save(students);
    }
    //delete student by id
    public void deleteStudent(Long id){
        repository.deleteById(id);
    }
}


