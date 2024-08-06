package com.demoapplication.controller;

import java.util.List;
import com.demoapplication.entity.studentEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.demoapplication.repository.studentRepository;

@RestController
public class studentController {

	@Autowired
	studentRepository repo;
	// get all the students
	// localhost:8080/students

	@GetMapping("/students")
	public List<studentEntity> getAllStudents() {
		List<studentEntity> students = repo.findAll();

		return students;
	}
	
	// localhost:8080/students/1
	@GetMapping("students/{id}")
	public studentEntity getStudent(@PathVariable int id) {
		studentEntity student = repo.findById(id).get();
		return student;
		
	}
	
	//
	@PostMapping("/student/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createStudent (@RequestBody studentEntity student) {
		repo.save(student);
		
	}
	
	@PutMapping("/student/update/{id}")
	public studentEntity updateStudents(@PathVariable int id) {
		studentEntity student = repo.findById(id).get();
		student.setFristName("Nandamuri");
		student.setLastName("Balayya");
		student.setBranch("TFI");
		student.setPercentage(90);
		repo.save(student);
		return student;
	}
	
	@DeleteMapping("/student/delete/{id}")
	public void removeStudent(@PathVariable int id) {
		studentEntity student = repo.findById(id).get();
		repo.delete(student);
	}

}
