package com.gal.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gal.dao.CabAllocationRepo;
import com.gal.dao.CabRepo;
import com.gal.dao.EmployeeRepository;
import com.gal.model.AllocationData;
import com.gal.model.Cab;
import com.gal.model.CabAllocation;
import com.gal.model.Employee;

import jakarta.transaction.Transactional;

@Service
public class AllocationServiceImpl implements AllocationService {

    @Autowired
    private CabRepo cabRepo;

    @Autowired
    private CabAllocationRepo cabAllocationRepo;

    @Autowired
    private EmployeeRepository empRepo;

    @Override
    @Transactional
    public List<CabAllocation> allocate(AllocationData allocData) {

        List<Integer> empList = allocData.getEmployees();
        int cabid = allocData.getCabId();
        Date aldate = allocData.getAllocDate();

        Cab cab = cabRepo.findById(cabid).orElseThrow();

        List<CabAllocation> allocationList = new ArrayList<>();

        for (int empid : empList) {

            Employee emp = empRepo.findById(empid).orElseThrow();

            CabAllocation caballo = new CabAllocation();
            caballo.setEmployee(emp);
            caballo.setCab(cab);
            caballo.setBookingDate(aldate);

            cabAllocationRepo.save(caballo);

            allocationList.add(caballo);
        }

        return allocationList;
    }
}