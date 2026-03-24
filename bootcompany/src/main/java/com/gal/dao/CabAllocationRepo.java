package com.gal.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gal.model.CabAllocation;

public interface CabAllocationRepo extends JpaRepository<CabAllocation, Integer> {
    List<CabAllocation> findByCab_RegnoAndBookingDate(String regno, Date bookingDate);
}