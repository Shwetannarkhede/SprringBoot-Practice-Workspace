package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entities.Student;
import com.tka.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/add")
	public String insertdata(@RequestBody Student s) {
		String msg= service.insertdata(s);
		return msg;
		
	}
	@PutMapping("/update/{studId}")
	public String updateData(@RequestBody Student s, @PathVariable int studId) {
		String msg = service.updateData(s, studId);
		return msg;
	}
	
	@DeleteMapping("/delete")
	public String deleteData(@RequestParam int studId) {
		String msg = service.deleteData(studId);
		return msg;
	}
	@GetMapping("/getsingledata/{studId}")
	public Student getSingleData(@PathVariable int studId) {
		Student s = service.getSingleData(studId);
		return s;
	}

	// Get All Students
	@GetMapping("/getAll")
	public List<Student> getAllStudents() {
		List<Student> list = service.getAllStudents();
		return list;
	}

}
