package com.gal.service;

import java.util.List;

import com.gal.model.Department;

public interface DepartmentService {

    Department find(int departmentId);

    List<Department> findAll();

    Department add(Department department);

    void delete(int departmentId);

    Department update(Department department);
    
    Department findByName(String name);

}