package com.example.backend_spring_boot.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String employeeName;
    private Date employeeBirthday;
    private String employeeIdCard;
    private String employeePhone;
    private String employeeEmail;
    private String employeeAddress;
    private double employeeSalary;

    @ManyToOne(targetEntity = Position.class)
//    @JsonManagedReference
    private Position position;

    @ManyToOne(targetEntity = Division.class)
//    @JsonManagedReference
    private Division division;

    @ManyToOne(targetEntity = EducationDegree.class)
//    @JsonManagedReference
    private EducationDegree educationDegree;
}
