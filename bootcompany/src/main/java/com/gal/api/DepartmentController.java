package com.gal.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gal.model.Department;
import com.gal.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger Log = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    DepartmentService departmentService;

    @GetMapping
    public Department getDepartmentById(@RequestParam("id") int id) {
        return departmentService.find(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getDepartment(@PathVariable int id) {
        Log.debug("request for department with id: {}", id);

        Department d = departmentService.find(id);

        if (d == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Department with id " + id + " not found");
        }

        return ResponseEntity.ok(d);
    }

    @GetMapping("/byname")
    public Department getDepartmentByName(@RequestParam("name") String name) {
        return departmentService.findByName(name);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Department addDepartment(@RequestBody Department department) {
        Log.debug("request for adding dep {}", department);
        return departmentService.add(department);
    }

    @PutMapping(consumes = "application/json", produces = "application/json")
    public Department updateDepartment(@RequestBody Department department) {
        Log.debug("request for updating dep {}", department);
        return departmentService.update(department);
    }
   

}