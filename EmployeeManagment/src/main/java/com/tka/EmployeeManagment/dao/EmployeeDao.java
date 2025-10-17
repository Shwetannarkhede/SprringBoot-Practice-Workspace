package com.tka.EmployeeManagment.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.EmployeeManagment.entities.Employee;

@Repository
public class EmployeeDao {

    @Autowired
    SessionFactory factory;

  
    public String insertData(Employee e) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(e);
        tx.commit();
        session.close();
        return "Employee data inserted successfully";
    }

    public String updateData(Employee e, int empID) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        String hql = "update Employee set name = :name, department = :dept, salary = :salary where empID = :id";
        MutationQuery query = session.createMutationQuery(hql);
        query.setParameter("name", e.getName());
        query.setParameter("dept", e.getDepartment());
        query.setParameter("salary", e.getSalary());
        query.setParameter("id", empID);
        int updated = query.executeUpdate();
        tx.commit();
        session.close();
        
        return "Employee data updated successfully";
        
    }


   
    public String deleteData(int empID) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        String hql = "delete from Employee where empID = :id";
        MutationQuery query = session.createMutationQuery(hql);
        query.setParameter("id", empID);
        int deleted = query.executeUpdate();
        tx.commit();
        session.close();
       
        return "Employee data deleted successfully";
       
    }
    

    
    public Employee getSingleData(int empID) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        String hqlQuery = "from Employee where empID =:empID";
        Query<Employee> query = session.createQuery(hqlQuery, Employee.class);
        query.setParameter("empID", empID);
        Employee e1 = query.getSingleResult();
        tx.commit();
        session.close();
        return e1;
    }

 
    public List<Employee> getAllRecord() {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        String hqlQuery = "from Employee";
        Query<Employee> query = session.createQuery(hqlQuery, Employee.class);
        List<Employee> list = query.list();
        tx.commit();
        session.close();
        return list;
    }
}
