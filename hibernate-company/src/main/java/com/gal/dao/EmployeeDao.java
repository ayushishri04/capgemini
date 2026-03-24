package com.gal.dao;

import com.gal.EntityManagerFactoryProvider;
import com.gal.model.Employee;

import jakarta.persistence.EntityManager;

public class EmployeeDao {

    public Employee getEmployee(int empid) {

        EntityManager em =
                EntityManagerFactoryProvider.getEntityManager();

        Employee emp = em.find(Employee.class, empid);

        return emp;
    }
}