package com.example.case_study.service.impl;

import com.example.case_study.entity.Position;
import com.example.case_study.repository.PositionRepository;
import com.example.case_study.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;
    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
