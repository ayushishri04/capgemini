package com.gal.repository;

import com.gal.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface IssueRepository extends JpaRepository<Issue, Long> {

    List<Issue> findByEmployeeIdAndResolvedFalse(Long employeeId);

    @Query("SELECT i FROM Issue i WHERE MONTH(i.createdDate) = MONTH(CURRENT_DATE)")
    List<Issue> findIssuesThisMonth();

    @Query("SELECT DISTINCT i.employee.name FROM Issue i WHERE MONTH(i.createdDate) = MONTH(CURRENT_DATE)")
    List<String> findEmployeeNamesThisMonth();
}