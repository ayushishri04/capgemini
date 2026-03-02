package com.gal.dao;

import com.gal.EntityManagerFactoryProvider;
import com.gal.model.Department;
import jakarta.persistence.EntityManager;

public class DepartmentDao {

    public Department getDepartment(int deptId) {

        EntityManager em =
                EntityManagerFactoryProvider.getEntityManager();

        Department dept = em.find(Department.class, deptId);

        return dept;
    }
}