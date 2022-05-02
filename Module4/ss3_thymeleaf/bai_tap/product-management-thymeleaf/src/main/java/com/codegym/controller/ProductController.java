package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("/index");
        List<Product> products = productService.findAll();
        modelAndView.addObject("products",products);
        return modelAndView;
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("product",new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Product product){
        product.setId((int) Math.random() * 100);
        productService.create(product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product",product);
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product){
        productService.update(product.getId(),product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable("id") int id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product",product);
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id")int id){
        productService.delete(id);
        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable("id")int id, Model model){
        Product product = productService.findById(id);
        model.addAttribute("product",product);
        return "/view";
    }

    @GetMapping("/search")
    public String search(@RequestParam("search")String name, Model model){
        List<Product> products = productService.searchByName(name);
        model.addAttribute("products",products);
        model.addAttribute("searchName",name);
        return "/index";
    }
}
