package com.example.demovalidatecustomer.entity;

import javax.validation.constraints.*;

public class Customer {
    @NotBlank(message = "Name not null")
    private String name;
    @NotEmpty(message = "Id card not empty")
    private String idCard;
    @NotEmpty(message = "Phone not empty")
    @Pattern(regexp = "\\d{10}", message = "Phone is not in the correct format")
    private String phone;
    @NotEmpty
    @Email(message = "Email is not in the correct format")
    private String email;

    public Customer() {
    }

    public Customer(String name, String idCard, String phone, String email) {
        this.name = name;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
