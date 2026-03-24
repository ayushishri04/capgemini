package com.gal.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "issues")
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Enumerated(EnumType.STRING)
    private IssueCategory category;

    private boolean resolved;

    private LocalDate createdDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private Employee employee;


    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public IssueCategory getCategory() {
        return category;
    }

    public boolean isResolved() {
        return resolved;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(IssueCategory category) {
        this.category = category;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}