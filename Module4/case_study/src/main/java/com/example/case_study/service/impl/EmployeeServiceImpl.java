package com.example.case_study.service.impl;

import com.example.case_study.entity.Employee;
import com.example.case_study.repository.EmployeeRepository;
import com.example.case_study.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Page<Employee> getList(String name, Pageable pageable) {
        return employeeRepository.findAll(name, pageable);
    }

    @Override
    public void save(Employee employee) {
        employee.setStatus(true);
        employeeRepository.save(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employee.setStatus(false);
        employeeRepository.save(employee);
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }
}
