package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entities.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory factory;
	
	public String insertData(Student s) {
	
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(s);
		tr.commit();
		ss.close();
		
		String msg="Data is inserted";
		return msg;
		
	}
	public String updateData(Student s,int studId) {
		
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
	Student s1	=ss.get(Student.class, studId);
		s1.setName(s.getName());
		s1.setCity(s.getCity());
		ss.merge(s1);
		
		tr.commit();
		ss.close();
		
		String msg="Data is updated";
		return msg;
		
	}
	public String deleteData(int studId) {
		
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		Student s1	=ss.get(Student.class, studId);
		
		ss.remove(s1);
		
		tr.commit();
		ss.close();
		
		String msg="Data is updated";
		return msg;
		
	}
	
    public Student getSingleData(int studId) {
        Session ss = factory.openSession();
    	Transaction tr = ss.beginTransaction();
		
        Student s = ss.get(Student.class, studId);
        
        
        ss.close();
        tr.commit();
        
        return s;
    }

    
    public List<Student> getAllStudents() {
        Session ss = factory.openSession();
        List<Student> list = ss.createQuery("from Student", Student.class).list();
        ss.close();
        return list;
    }


	
	
}
