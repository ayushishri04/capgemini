package com.gal.api;

import com.gal.model.AllocationData;
import com.gal.model.CabAllocation;
import com.gal.service.AllocationService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/allocation")
public class AllocationController {

    private static final Logger log = LoggerFactory.getLogger(AllocationController.class);

    @Autowired
    private AllocationService allocationService;

    @PostMapping(path = "/allocate", produces = "application/json", consumes = "application/json")
    public List<CabAllocation> allocate(@RequestBody AllocationData allocationData) {

        log.debug("Received allocation request: {}", allocationData);

        return allocationService.allocate(allocationData); // ✅ FIXED
    }
}