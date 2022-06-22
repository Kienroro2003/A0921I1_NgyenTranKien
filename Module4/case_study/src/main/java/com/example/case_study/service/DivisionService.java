package com.example.case_study.service;

import com.example.case_study.entity.Division;
import com.example.case_study.repository.DivisionRepository;

import java.util.List;

public interface DivisionService {
    List<Division> findAll();
}
