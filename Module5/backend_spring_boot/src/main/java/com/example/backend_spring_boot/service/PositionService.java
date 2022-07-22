package com.example.backend_spring_boot.service;

import com.example.backend_spring_boot.entity.Division;
import com.example.backend_spring_boot.entity.Position;

import java.util.List;

public interface PositionService {
    List<Position> getAll();
}
