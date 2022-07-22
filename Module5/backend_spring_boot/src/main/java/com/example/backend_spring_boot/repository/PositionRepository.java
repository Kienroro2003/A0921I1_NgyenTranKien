package com.example.backend_spring_boot.repository;

import com.example.backend_spring_boot.entity.EducationDegree;
import com.example.backend_spring_boot.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {
}
