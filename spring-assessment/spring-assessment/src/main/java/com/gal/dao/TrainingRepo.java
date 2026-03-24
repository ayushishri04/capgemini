package com.gal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gal.model.Training;

public interface TrainingRepo extends JpaRepository<Training, Integer> {

}