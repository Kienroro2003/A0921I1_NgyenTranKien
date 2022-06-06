package com.codegym.example.spring_customer_management.repository;

import com.codegym.example.spring_customer_management.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvinceRepository extends JpaRepository<Province, Long> {
}
