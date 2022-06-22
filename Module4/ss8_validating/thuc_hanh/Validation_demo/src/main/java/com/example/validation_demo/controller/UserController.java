package com.example.validation_demo.controller;

import com.example.validation_demo.dto.UserDto;
import com.example.validation_demo.entity.User;
import com.example.validation_demo.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ModelAttribute(name = "createUser")
    public UserDto formUser(){
        return new UserDto();
    }

    @GetMapping("/create")
    public ModelAndView create(){
        return new ModelAndView("/user/register");
    }

    @PostMapping("/register")
    public ModelAndView register(@ModelAttribute("createUser")@Validated UserDto userDto,
                                 BindingResult bindingResult){
        new UserDto().validate(userDto, bindingResult);
        System.out.println(userDto);
        ModelAndView modelAndView = new ModelAndView();
        if(bindingResult.hasFieldErrors()){
            modelAndView.setViewName("/user/register");
            return modelAndView;
        }
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        userService.create(user);
        modelAndView.setViewName("/user/result");
        return modelAndView;
    }


}
