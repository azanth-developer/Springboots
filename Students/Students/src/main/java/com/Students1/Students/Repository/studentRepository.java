package com.Students1.Students.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Students1.Students.model.students;


public interface studentRepository extends JpaRepository<students,Long>{
	
}