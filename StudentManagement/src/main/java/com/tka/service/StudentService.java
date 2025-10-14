package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentDao;
import com.tka.entities.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;
	public String insertdata(Student s) {
		String msg= dao.insertData(s);
		return msg;
		
	}

}
