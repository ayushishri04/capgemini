package com.gal.model;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
@Entity
public class Employee {
	@Id
	@Column(name = "employee_id")
	private int employee_Id;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String phone_number;

	@Column(name = "hire_date")
	private Date hire_date;

	@Column(name = "job_title")
	private String job_title;

	@Column(name = "salary")
	private double salary;

	@Column(name = "manager_id")
	private Integer manager_Id;

	@Column(name = "department_id")
	private Integer department_Id;
    // Default Constructor
    public Employee() {
    }

    // Parameterized Constructor
    public Employee(int employee_Id, String firstname, String lastname,
                    String email, String phoneNumber, Date hireDate,
                    String jobTitle, double salary,
                    Integer managerId, Integer department_Id) {

        this.employee_Id = employee_Id;
        this.first_name = firstname;
        this.last_name = lastname;
        this.email = email;
        this.phone_number = phoneNumber;
        this.hire_date = hireDate;
        this.job_title = jobTitle;
        this.salary = salary;
        this.manager_Id = managerId;
        this.department_Id = department_Id;
        
    }

    // Getters and Setters

    public int getEmployeeId() {
        return employee_Id;
    }

    public void setEmployeeId(int employeeId) {
        this.employee_Id = employeeId;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String firstname) {
        this.first_name = firstname;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String lastName) {
        this.last_name = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phone_number = phoneNumber;
    }

    public Date getHireDate() {
        return hire_date;
    }

    public void setHireDate(Date hireDate) {
        this.hire_date = hireDate;
    }

    public String getJobTitle() {
        return job_title;
    }

    public void setJobTitle(String jobTitle) {
        this.job_title = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Integer getManagerId() {
        return manager_Id;
    }

    public void setManagerId(Integer managerId) {
        this.manager_Id = managerId;
    }

    public Integer getDepartmentId() {
        return department_Id;
    }

//    public void setDepartmentId(Integer departmentId) {
//        this.department_Id = department_Id;
//    }

    @Override
    public String toString() {
        return employee_Id + " " + first_name + " " + last_name +
                " | " + job_title + " | Salary: " + salary;
    }

}