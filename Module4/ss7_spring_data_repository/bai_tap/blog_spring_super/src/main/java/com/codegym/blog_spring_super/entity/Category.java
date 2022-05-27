package com.codegym.blog_spring_super.entity;

import java.util.Set;

public class Category {
    private Integer id;
    private String categoryName;

    private Set<Blog> blogs;
}
