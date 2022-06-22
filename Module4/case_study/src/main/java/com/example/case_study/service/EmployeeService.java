package com.example.case_study.service;

import com.example.case_study.entity.Customer;
import com.example.case_study.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> getList(String name, Pageable pageable);
    void save(Employee employee);
    void update(Employee employee);
    void deleteEmployee(Employee employee);
    Employee findById(int id);
}
