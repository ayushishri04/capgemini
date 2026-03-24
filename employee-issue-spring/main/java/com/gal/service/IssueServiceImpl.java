package com.gal.service;

import com.gal.model.Employee;
import com.gal.model.Issue;
import com.gal.repository.EmployeeRepository;
import com.gal.repository.IssueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueServiceImpl implements IssueService {

    @Autowired
    private IssueRepository issueRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Issue saveIssue(Issue issue) {

        Long empId = issue.getEmployee().getId();
        Employee employee = employeeRepository.findById(empId)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        issue.setEmployee(employee);

        return issueRepository.save(issue);
    }

    @Override
    public List<Issue> getUnresolvedIssuesByEmployee(Long empId) {
        return issueRepository.findByEmployeeIdAndResolvedFalse(empId);
    }

    @Override
    public List<Issue> getIssuesThisMonth() {
        return issueRepository.findIssuesThisMonth();
    }

    @Override
    public List<String> getEmployeeNamesThisMonth() {
        return issueRepository.findEmployeeNamesThisMonth();
    }
}