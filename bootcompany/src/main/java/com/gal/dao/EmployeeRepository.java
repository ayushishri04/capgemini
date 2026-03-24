package com.gal.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gal.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findByFirstname(String firstname);

    Employee findByLastname(String lastname);
    
    List<Employee> findByCabNumberAndBookingDate(String cabNumber, Date bookingDate);

}