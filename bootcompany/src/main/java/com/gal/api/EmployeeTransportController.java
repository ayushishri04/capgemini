package com.gal.api;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gal.model.Employee;
import com.gal.service.EmployeeService;
@RestController
@RequestMapping("/transport")
public class EmployeeTransportController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/cab-date")
	public List<Employee> getEmployeesByCabAndDate(@RequestParam String cabNumber, @RequestParam String date) {
		Date bookingDate = Date.valueOf(date);
		return employeeService.getEmployeesByCabAndDate(cabNumber, bookingDate);
	}
}
