package com.example.case_study.repository;

import com.example.case_study.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Page<Customer> findAllByCustomerNameContaining(String name, Pageable pageable);

    @Query(value = "select * from customer where customer_name like concat('%',:name,'%') and status = true",
    nativeQuery = true,
    countQuery = "select count(*) from (select * from customer where customer_name like concat('%',:name,'%') and status = true) abc")
    Page<Customer> findAll(@Param(value = "name")String name, Pageable pageable);

}
