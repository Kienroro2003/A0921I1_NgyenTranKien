package com.example.backend_spring_boot.service.impl;

import com.example.backend_spring_boot.entity.Position;
import com.example.backend_spring_boot.repository.PositionRepository;
import com.example.backend_spring_boot.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;
    @Override
    public List<Position> getAll() {
        return positionRepository.findAll();
    }
}
