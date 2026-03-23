package com.gal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gal.model.Training;

@Service
public class TrainingServiceImpl implements TrainingService {

    @Override
    public List<Training> findByTopic(String topic) {
        return null;
    }

    @Override
    public Training findById(int trainingid) {
        return null;
    }

    @Override
    public Training addTraining(Training training) {
        return null;
    }

    @Override
    public Training updateTraining(Training training) {
        return null;
    }

    @Override
    public boolean deleteTraining(int trainingid) {
        return false;
    }
}