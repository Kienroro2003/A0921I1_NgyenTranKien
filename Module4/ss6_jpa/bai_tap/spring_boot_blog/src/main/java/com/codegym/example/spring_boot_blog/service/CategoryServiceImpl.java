package com.codegym.example.spring_boot_blog.service;

import com.codegym.example.spring_boot_blog.entity.Category;
import com.codegym.example.spring_boot_blog.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        List<Category> categories = new ArrayList<>();
        categoryRepository.findAll().forEach(c -> categories.add(c));
        return categories;
    }
}
