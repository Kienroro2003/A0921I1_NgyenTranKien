package com.codegym.controller;

import com.codegym.dao.UserDAO;
import com.codegym.model.Login;
import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView model = new ModelAndView("/home", "login", new Login());
        return model;
    }
@PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login) {
        ModelAndView model;
        User user = UserDAO.checkLogin(login);
        if (user == null) {
            model = new ModelAndView("/error");
        } else {
            model = new ModelAndView("/user");
            model.addObject("user", user);
        }
        return model;
    }
}
