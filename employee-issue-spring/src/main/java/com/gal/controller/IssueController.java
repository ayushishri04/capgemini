package com.gal.controller;

import com.gal.model.Issue;
import com.gal.service.IssueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/issues")
public class IssueController {

    @Autowired
    private IssueService service;

    @PostMapping
    public Issue createIssue(@RequestBody Issue issue) {
        return service.saveIssue(issue);
    }

    @GetMapping("/employee/{id}/unresolved")
    public List<Issue> getUnresolved(@PathVariable Long id) {
        return service.getUnresolvedIssuesByEmployee(id);
    }

    @GetMapping("/this-month")
    public List<Issue> getThisMonth() {
        return service.getIssuesThisMonth();
    }

    @GetMapping("/employees-this-month")
    public List<String> getNames() {
        return service.getEmployeeNamesThisMonth();
    }
}