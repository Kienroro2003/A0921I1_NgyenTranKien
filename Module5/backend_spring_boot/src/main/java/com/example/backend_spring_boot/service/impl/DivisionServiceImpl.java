package com.example.backend_spring_boot.service.impl;

import com.example.backend_spring_boot.entity.Division;
import com.example.backend_spring_boot.repository.DivisionRepository;
import com.example.backend_spring_boot.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    private DivisionRepository divisionRepository;
    @Override
    public List<Division> getAll() {
        return divisionRepository.findAll();
    }
}
