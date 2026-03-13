package com.gal.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gal.model.Anorder;
import com.gal.service.AnorderService;

@RestController
@RequestMapping("/anorder")
public class AnorderController {

    @Autowired
    AnorderService anorderService;

    @GetMapping("/{id}")
    public Anorder getanorder(@PathVariable int id) {
        return anorderService.find(id);
    }

    @GetMapping("/all")
    public List<Anorder> getAllOrders() {
        return anorderService.findAll();
    }

    @PostMapping("/add")
    public String addOrder(@RequestBody Anorder anorder) {
        anorderService.add(anorder);
        return "Order Added Successfully";
    }

    @PutMapping("/update")
    public String updateOrder(@RequestBody Anorder anorder) {
        anorderService.update(anorder);
        return "Order Updated Successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteOrder(@PathVariable int id) {
        anorderService.delete(id);
        return "Order Deleted Successfully";
    }
}