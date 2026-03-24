package com.gal.api;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.gal.model.Training;
import com.gal.service.TrainingService;

@WebMvcTest(TrainingController.class)
class TrainerControllerTest {

	@MockBean
	TrainingService trainingService;

	@Autowired
	MockMvc mockMvc;

	@Test
	void testById() throws Exception {

		Training t = new Training(101, Date.valueOf("2026-03-07"), Date.valueOf("2020-04-09"), "Sprint",
				"Dinesh Kumar");

		when(trainingService.findById(101)).thenReturn(t);

		mockMvc.perform(get("/training/101").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$.trainingid").value(101));
	}
}