package com.example.case_study.repository;

import com.example.case_study.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "select * from employee as e where e.employee_name like concat('%',:name,'%') and e.status = true ",
    nativeQuery = true,
    countQuery = "select count(*) from (select * from employee as e where e.employee_name like concat('%',:name,'%') and e.status = true )abc")
    Page<Employee> findAll(@Param(value = "name")String name, Pageable pageable);
}
