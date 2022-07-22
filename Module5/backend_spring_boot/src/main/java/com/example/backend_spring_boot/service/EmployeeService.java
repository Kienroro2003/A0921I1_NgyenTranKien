package com.example.backend_spring_boot.service;

import com.example.backend_spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();

    void addEmployee(Employee employee);
}
