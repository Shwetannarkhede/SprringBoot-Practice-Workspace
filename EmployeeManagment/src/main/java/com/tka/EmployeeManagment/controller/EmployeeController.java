package com.tka.EmployeeManagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tka.EmployeeManagment.entities.Employee;
import com.tka.EmployeeManagment.service.EmployeeService;



@RestController

public class EmployeeController {

    @Autowired
     EmployeeService service;

   
    @PostMapping("/add")
    public String insertData(@RequestBody Employee e) {
        return service.insertData(e);
    }

   
    @PutMapping("/update/{empID}")
    public String updateData(@RequestBody Employee e, @PathVariable int empID) {
        return service.updateData(e, empID);
    }

   
    @DeleteMapping("/delete")
    public String deleteData(@RequestParam int empID) {
        return service.deleteData(empID);
    }

   
    @GetMapping("/get/{empID}")
    public Employee getSingleData(@PathVariable int empID) {
        return service.getSingleData(empID);
    }


    @GetMapping("/getAll")
    public List<Employee> getAllRecord() {
        return service.getAllRecord();
    }
}
