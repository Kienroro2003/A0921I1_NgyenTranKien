package com.codegym.example.spring_boot_blog.controller;

import com.codegym.example.spring_boot_blog.entity.Blog;
import com.codegym.example.spring_boot_blog.entity.Category;
import com.codegym.example.spring_boot_blog.service.BlogService;
import com.codegym.example.spring_boot_blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/blog")
public class BookController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/list")
    public ModelAndView getList(){
        return new ModelAndView("/blog/list","blogs",blogService.findAll());
    }

    @ModelAttribute("blogCreate")
    public Blog setBlog(){
        Blog blog = new Blog();
        blog.setCategory(new Category());
        return blog;
    }


    @GetMapping("/create")
    public ModelAndView viewCreate(){
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("categories",categoryService.findAll());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView getCreate(Blog blog){
        blogService.create(blog);
        return new ModelAndView("redirect:/blog/list");
    }

    @GetMapping("/update/{id}")
    public ModelAndView viewUpdate(@PathVariable("id")Blog blog){
        ModelAndView modelAndView = new ModelAndView("/blog/update","blog",blog);
        modelAndView.addObject("categories",categoryService.findAll());
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView getUpdate(Blog blog){
        blogService.update(blog);
        return new ModelAndView("redirect:/blog/list");
    }

    @GetMapping("/remove")
    public ModelAndView getDelete(@RequestParam("id")int blog){
        blogService.remove(blog);
        return new ModelAndView("redirect:/blog/list");
    }

    @GetMapping("/detail/{id}")
    public ModelAndView getView(@PathVariable("id")Blog blog){
        ModelAndView modelAndView = new ModelAndView("/blog/view","blog",blog);
        return modelAndView;
    }


}
