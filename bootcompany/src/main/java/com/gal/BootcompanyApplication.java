package com.gal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gal.model.Department;
import com.gal.model.Employee;
import com.gal.service.DepartmentService;
import com.gal.service.EmployeeService;

@SpringBootApplication
public class BootcompanyApplication {

	private static final Logger Log = LoggerFactory.getLogger(BootcompanyApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(BootcompanyApplication.class, args);

		Log.info("application started successfully");

		DepartmentService deptService = context.getBean(DepartmentService.class);

		Department d1 = new Department();
		d1.setDepartmentid(101);
		d1.setDepname("CS");

		deptService.add(d1);
		Log.info("{}", deptService.find(101));
		deptService.findAll().forEach(dep -> Log.info("{}", dep));

		Department updateDept = new Department();
		updateDept.setDepartmentid(101);
		updateDept.setDepname("Computer Science");

		deptService.update(updateDept);
		deptService.findAll().forEach(dep -> Log.info("{}", dep));

		deptService.delete(101);
		deptService.findAll().forEach(dep -> Log.info("{}", dep));

		EmployeeService empService = context.getBean(EmployeeService.class);

		Employee e1 = new Employee();
		e1.setEmployeeId(1);
		e1.setFirstname("John");
		e1.setLastname("Doe");

		empService.add(e1);
		Log.info("{}", empService.find(1));
		empService.findAll().forEach(emp -> Log.info("{}", emp));

		Employee updateEmp = new Employee();
		updateEmp.setEmployeeId(1);
		updateEmp.setFirstname("Johnny");
		updateEmp.setLastname("Doe");

		empService.update(updateEmp);
		empService.findAll().forEach(emp -> Log.info("{}", emp));

		empService.delete(1);
		empService.findAll().forEach(emp -> Log.info("{}", emp));
	}
}