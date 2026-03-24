package com.gal;

import com.gal.controller.IssueController;
import com.gal.service.IssueService;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(IssueController.class)
public class IssueControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IssueService issueService;

    @Test
    void testGetUnresolvedIssues() throws Exception {
        Mockito.when(issueService.getUnresolvedIssuesByEmployee(1L))
                .thenReturn(Collections.emptyList());

        mockMvc.perform(get("/issues/employee/1/unresolved"))
                .andExpect(status().isOk());
    }

    @Test
    void testGetIssuesThisMonth() throws Exception {
        Mockito.when(issueService.getIssuesThisMonth())
                .thenReturn(Collections.emptyList());

        mockMvc.perform(get("/issues/this-month"))
                .andExpect(status().isOk());
    }

    @Test
    void testGetEmployeeNamesThisMonth() throws Exception {
        Mockito.when(issueService.getEmployeeNamesThisMonth())
                .thenReturn(Collections.emptyList());

        mockMvc.perform(get("/issues/employees-this-month"))
                .andExpect(status().isOk());
    }
}