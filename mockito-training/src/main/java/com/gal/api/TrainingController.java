package com.gal.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gal.model.Training;
import com.gal.service.TrainingService;

@RestController
@RequestMapping("/training")
public class TrainingController {

	private TrainingService trainingService;

	@Autowired
	public TrainingController(TrainingService trainingService) {
		this.trainingService = trainingService;
	}

	@GetMapping("/{trainingid}") // ✅ FIXED
	public Training findById(@PathVariable("trainingid") int trainingid) {
		return trainingService.findById(trainingid);
	}
}