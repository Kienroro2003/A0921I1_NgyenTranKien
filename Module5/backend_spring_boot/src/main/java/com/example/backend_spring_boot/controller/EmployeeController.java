package com.example.backend_spring_boot.controller;

import com.example.backend_spring_boot.entity.Employee;
import com.example.backend_spring_boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public List<Employee> getAll(){
        return this.employeeService.getAll();
    }

    @PostMapping("/create")
    public void getAddEmployee(@RequestBody Employee employee){
        this.employeeService.addEmployee(employee);
    }

}
