package com.codegym.blog_spring_super.controller;

import com.codegym.blog_spring_super.entity.Blog;
import com.codegym.blog_spring_super.entity.Category;
import com.codegym.blog_spring_super.service.BlogService;
import com.codegym.blog_spring_super.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private BlogService blogService;


    @ModelAttribute("findAllCategories")
    public List<Category> getListCategories(){
        return categoryService.findAll();
    }

    @GetMapping("/list")
    public ModelAndView getList(@RequestParam(name = "author",defaultValue = "")String author,
                                @RequestParam(name = "category",defaultValue = "")String id,
                                @PageableDefault(size = 5)Pageable pageable
                                ) {

        ModelAndView modelAndView =new ModelAndView("/blog/list", "blogs", blogService.getAllBlog(author,id,pageable));
        modelAndView.addObject("categories",categoryService.findAll());
        return modelAndView;
    }

    @GetMapping("/list/{numPage}")
    public ModelAndView viewPage(@RequestParam(name = "author",defaultValue = "")String author,
                                 @RequestParam(name = "category",defaultValue = "")String id,
                                 Pageable pageable
    ){
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        Page<Blog> blogs = blogService.getAllBlog(author, id, pageable);
        modelAndView.addObject("blogs", blogs);
        modelAndView.addObject("categories",categoryService.findAll());

        return modelAndView;
    }

    @ModelAttribute("createBlog")
    public Blog getCreate(){
        Blog blog = new Blog();
        blog.setCategory(new Category());
        return blog;
    }

    @GetMapping("/create")
    public ModelAndView viewCreate(){
        return new ModelAndView("/blog/create","categories",categoryService.findAll());
    }

    @PostMapping("/create")
    public ModelAndView getCreate(Blog blog){
        blogService.create(blog);
        return new ModelAndView("redirect:/blog/list");
    }

    @GetMapping("/edit")
    public ModelAndView viewEdit(@RequestParam("id")Blog blog){
        ModelAndView modelAndView = new ModelAndView("/blog/update");
        modelAndView.addObject("blog",blog);
        modelAndView.addObject("categories",categoryService.findAll());
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView getEdit(Blog blog){
        blogService.update(blog);
        return new ModelAndView("redirect:/blog/list");
    }

    @GetMapping("/view")
    public ModelAndView view(@RequestParam("id")Blog blog){
        ModelAndView modelAndView = new ModelAndView("/blog/view","blog",blog);
        return modelAndView;
    }
}
