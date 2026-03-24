package com.gal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gal.model.Training;

@Repository//convert sql exception to runtimeexception
public interface TrainingRepository extends JpaRepository<Training,Integer>{
	
	

}
