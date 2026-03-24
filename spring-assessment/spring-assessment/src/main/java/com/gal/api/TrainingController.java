package com.gal.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gal.model.Training;
import com.gal.service.TrainingService;

@RestController
public class TrainingController {

    @Autowired
    private TrainingService service;

    @GetMapping("/")
    public List<Training> home() {
        return service.getAll();
    }

    @GetMapping("/training")
    public List<Training> getAllTrainings() {
        return service.getAll();
    }
}