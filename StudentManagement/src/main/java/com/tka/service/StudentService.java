package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentDao;
import com.tka.entities.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;

	public String insertdata(Student s) {
		String msg = dao.insertData(s);
		return msg;

	}

	public String updateData(Student s, int studId) {
		String msg = dao.updateData(s, studId);
		return msg;

	}

	public String deleteData(int studId) {
		String msg = dao.deleteData(studId);
		return msg;

	}

	public Student getSingleData(int studId) {
		Student s = dao.getSingleData(studId);
		return s;
	}

	public List<Student> getAllStudents() {
		List<Student> list = dao.getAllStudents();
		return list;
	}
}
