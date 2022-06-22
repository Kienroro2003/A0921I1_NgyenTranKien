package com.example.case_study.service;

import com.example.case_study.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> getList(String name, Pageable pageable);
    void save(Customer customer);
    void update(Customer customer);
    void deleteCustomer(Customer customer);
    Customer findById(int id);
}
