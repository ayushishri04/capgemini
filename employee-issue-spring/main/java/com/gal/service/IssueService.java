package com.gal.service;

import com.gal.model.Issue;
import java.util.List;

public interface IssueService {

    List<Issue> getUnresolvedIssuesByEmployee(Long empId);

    List<Issue> getIssuesThisMonth();

    List<String> getEmployeeNamesThisMonth();

    Issue saveIssue(Issue issue);
}