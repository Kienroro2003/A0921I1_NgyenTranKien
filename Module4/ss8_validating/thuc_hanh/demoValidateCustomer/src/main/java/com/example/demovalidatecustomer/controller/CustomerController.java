package com.example.demovalidatecustomer.controller;

import com.example.demovalidatecustomer.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class CustomerController {
    @ModelAttribute("createCustomer")
    public Customer createCustomer(){
        return new Customer();
    }

    @GetMapping("/")
    public ModelAndView viewCreateCustomer(){
        return new ModelAndView("registor");
    }

    @PostMapping("/registor")
    public ModelAndView getCreateCustomer(@ModelAttribute("createCustomer") @Validated Customer customer,
                                          BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        if(bindingResult.hasFieldErrors()){
            modelAndView.setViewName("registor");
            return modelAndView;
        }
        modelAndView.setViewName("result");
        return modelAndView;
    }
}
