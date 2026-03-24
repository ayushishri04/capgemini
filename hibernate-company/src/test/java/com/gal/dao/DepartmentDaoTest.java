package com.gal.dao;

import com.gal.EntityManagerFactoryProvider;
import com.gal.model.Department;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DepartmentDaoTest {

    @BeforeAll
    public static void openConnections() {
        System.out.println("opening connections");
        EntityManagerFactoryProvider.getEntityManager();
    }

    @Test
    void testGetDepartment() {

        DepartmentDao dao = new DepartmentDao();

        Department department = dao.getDepartment(10);

        assertNotNull(department);
        System.out.println(department);

        assertEquals("Administration", department.getDepartmentName());
    }

    @AfterAll
    public static void closeConnection() {
        System.out.println("closing connections");
        EntityManagerFactoryProvider.getEntityManagerFactory().close();
    }
}