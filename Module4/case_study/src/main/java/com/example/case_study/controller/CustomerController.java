package com.example.case_study.controller;

import com.example.case_study.dto.CustomerDto;
import com.example.case_study.entity.Customer;
import com.example.case_study.entity.CustomerType;
import com.example.case_study.service.CustomerService;
import com.example.case_study.service.CustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerTypeService customerTypeService;

    @ModelAttribute("createCustomer")
    public CustomerDto createCustomer(){
        CustomerDto customer = new CustomerDto();
        customer.setCustomerType(new CustomerType());
        return customer;
    }
//---------------------list---------------------
    @GetMapping("/list")
    public String getViewListCustomer(@CookieValue("hello") Model model,
                                      @RequestParam(value = "name", required = false, defaultValue = "") String name,
                                      @PageableDefault(size = 5)Pageable pageable){
        model.addAttribute("customers", customerService.getList(name,pageable));
        return "customer/list";
    }
    //---------------------create---------------------
    @GetMapping("/create")
    public ModelAndView getViewCreateCustomer(){
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customerTypes", customerTypeService.findAll());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView getCreateCustomer(@Validated @ModelAttribute("createCustomer")CustomerDto customerDto,
                                          BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        if(bindingResult.hasFieldErrors()){
            modelAndView.setViewName("/customer/create");
            modelAndView.addObject("customerTypes", customerTypeService.findAll());
            return modelAndView;
        }else{
            modelAndView.setViewName("redirect:/customer/list");
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto,customer);
            customerService.save(customer);
            return modelAndView;
        }
    }
    //---------------------delete---------------------
    @GetMapping("/delete")
    public ModelAndView getDelete(@RequestParam("id")int id){
        Customer customer = customerService.findById(id);
        customerService.deleteCustomer(customer);
        return new ModelAndView("redirect:/customer/list");
    }
    //---------------------update---------------------
    @GetMapping("/edit")
    public ModelAndView getViewUpdateCustomer(@RequestParam("id")Customer customer){
        CustomerDto customerDto = new CustomerDto();
        BeanUtils.copyProperties(customer, customerDto);
        ModelAndView modelAndView = new ModelAndView("/customer/update", "customerDto", customerDto);
        modelAndView.addObject("customerTypes",customerTypeService.findAll());
        return modelAndView;
    }

    @PostMapping("edit")
    public ModelAndView getUpdateCustomer(@Validated @ModelAttribute("customerDto")CustomerDto customerDto,
                                          BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        if(bindingResult.hasFieldErrors()){
            modelAndView.setViewName("/customer/update");
            modelAndView.addObject("customerTypes", customerTypeService.findAll());
            return modelAndView;
        }else{
            modelAndView.setViewName("redirect:/customer/list");
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto,customer);
            customerService.update(customer);
            return modelAndView;
        }
    }
    //---------------------view---------------------
    @GetMapping("view")
    public ModelAndView getViewCustomer(@RequestParam("id")Customer customer){
        return new ModelAndView("customer/view", "customer", customer);
    }

}
