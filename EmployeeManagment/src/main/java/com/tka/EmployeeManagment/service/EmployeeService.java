package com.tka.EmployeeManagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.EmployeeManagment.dao.EmployeeDao;
import com.tka.EmployeeManagment.entities.Employee;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao dao;

    
    public String insertData(Employee e) {
        return dao.insertData(e);
    }

    
    public String updateData(Employee e, int empID) {
        return dao.updateData(e, empID);
    }

   
    public String deleteData(int empID) {
        return dao.deleteData(empID);
    }

   
    public Employee getSingleData(int empID) {
        return dao.getSingleData(empID);
    }

   
    public List<Employee> getAllRecord() {
        return dao.getAllRecord();
    }
}
