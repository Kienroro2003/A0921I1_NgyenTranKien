package com.example.backend_spring_boot.repository;

import com.example.backend_spring_boot.entity.Division;
import com.example.backend_spring_boot.entity.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepository extends JpaRepository<Division, Integer> {
}
