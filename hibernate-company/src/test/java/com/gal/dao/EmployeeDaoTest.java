package com.gal.dao;
import com.gal.EntityManagerFactoryProvider;
import com.gal.model.Employee;
	import org.junit.jupiter.api.*;

	import static org.junit.jupiter.api.Assertions.*;

	public class EmployeeDaoTest {

	    @BeforeAll
	    public static void openConnections() {
	        System.out.println("opening connections");
	        EntityManagerFactoryProvider.getEntityManager();
	    }

	    @Test
	    void testGetEmployee() {

	        EmployeeDao dao = new EmployeeDao();

	        Employee employee = dao.getEmployee(100);

	        assertNotNull(employee);
	        System.out.println(employee);

	        assertEquals("Steven", employee.getFirstName());
	    }

	    @AfterAll
	    public static void closeConnection() {
	        System.out.println("closing connections");

	        EntityManagerFactoryProvider.getEntityManagerFactory().close();
	    }
	}