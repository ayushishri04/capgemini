package com.gal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {

    @Id
    @Column(name = "department_id")
    private int department_id;

    @Column(name = "department_name")
    private String department_name;

    @Column(name = "manager_id")
    private Integer manager_id;

    // Default Constructor
    public Department() {
    }

    // Parameterized Constructor
    public Department(int department_id, String department_name, Integer manager_id) {
        this.department_id = department_id;
        this.department_name = department_name;
        this.manager_id = manager_id;
    }

    // Getters and Setters

    public int getDepartmentId() {
        return department_id;
    }

    public void setDepartmentId(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartmentName() {
        return department_name;
    }

    public void setDepartmentName(String department_name) {
        this.department_name = department_name;
    }

    public Integer getManagerId() {
        return manager_id;
    }

    public void setManagerId(Integer manager_id) {
        this.manager_id = manager_id;
    }

    @Override
    public String toString() {
        return department_id + " | " + department_name + " | Manager: " + manager_id;
    }
}