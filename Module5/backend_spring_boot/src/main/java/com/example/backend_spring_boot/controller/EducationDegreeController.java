package com.example.backend_spring_boot.controller;

import com.example.backend_spring_boot.entity.EducationDegree;
import com.example.backend_spring_boot.entity.Position;
import com.example.backend_spring_boot.service.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/education_degree")
public class EducationDegreeController {
    @Autowired
    private EducationDegreeService educationDegreeService;

    @GetMapping("/list")
    public List<EducationDegree> getAll() {
        return this.educationDegreeService.getAll();
    }
}
