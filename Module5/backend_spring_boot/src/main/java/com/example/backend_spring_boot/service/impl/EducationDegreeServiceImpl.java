package com.example.backend_spring_boot.service.impl;

import com.example.backend_spring_boot.entity.EducationDegree;
import com.example.backend_spring_boot.repository.EducationDegreeRepository;
import com.example.backend_spring_boot.service.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    private EducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> getAll() {
        return educationDegreeRepository.findAll();
    }
}
