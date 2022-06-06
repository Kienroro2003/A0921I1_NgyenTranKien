package com.codegym.example.spring_customer_management.service;

import com.codegym.example.spring_customer_management.entity.Customer;
import com.codegym.example.spring_customer_management.entity.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService extends GeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
