package com.example.backend_spring_boot.controller;

import com.example.backend_spring_boot.entity.Division;
import com.example.backend_spring_boot.entity.Position;
import com.example.backend_spring_boot.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/division")
public class DivisionController {
    @Autowired
    private DivisionService divisionService;

    @GetMapping("/list")
    public List<Division> getAll() {
        return this.divisionService.getAll();
    }
}
