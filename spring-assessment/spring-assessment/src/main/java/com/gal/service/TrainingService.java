package com.gal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gal.dao.TrainingRepo;
import com.gal.model.Training;

@Service
public class TrainingService {

    @Autowired
    private TrainingRepo repo;

    public List<Training> getAll() {
        return repo.findAll();
    }
}