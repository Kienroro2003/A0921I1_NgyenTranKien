package com.codegym.blog_spring_super.service;

import com.codegym.blog_spring_super.entity.Blog;
import com.codegym.blog_spring_super.entity.Category;
import com.codegym.blog_spring_super.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void create(Category category) {

    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public List<Category> findAll() {
        List<Category> list = new ArrayList<>();
        categoryRepository.findAll().forEach(c -> list.add(c));
        return list;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Category category) {

    }
}
