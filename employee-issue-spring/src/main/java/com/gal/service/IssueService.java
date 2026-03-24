package com.gal.service;

import com.gal.model.Issue;
import java.util.List;

public interface IssueService {

    Issue saveIssue(Issue issue);

    List<Issue> getUnresolvedIssuesByEmployee(Long empId);

    List<Issue> getIssuesThisMonth();

    List<String> getEmployeeNamesThisMonth();
}