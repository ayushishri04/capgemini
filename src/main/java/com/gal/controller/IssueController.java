package com.gal.controller;

import com.gal.model.Issue;
import com.gal.service.IssueService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/issues")
public class IssueController {

    private static final Logger logger = LoggerFactory.getLogger(IssueController.class);

    @Autowired
    private IssueService issueService;
    @PostMapping
    public Issue createIssue(@RequestBody Issue issue) {
        logger.info("Creating issue: {}", issue);
        return issueService.saveIssue(issue);
    }

    @GetMapping("/employee/{id}/unresolved")
    public List<Issue> getUnresolved(@PathVariable Long id) {
        logger.info("Fetching unresolved issues for employee {}", id);
        return issueService.getUnresolvedIssuesByEmployee(id);
    }
    @GetMapping("/this-month")
    public List<Issue> getThisMonthIssues() {
        logger.info("Fetching issues for current month");
        return issueService.getIssuesThisMonth();
    }
    @GetMapping("/employees-this-month")
    public List<String> getEmployeeNames() {
        logger.info("Fetching employee names who raised issues this month");
        return issueService.getEmployeeNamesThisMonth();
    }
}