package com.codegym.repository;

import com.codegym.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    void create(Product product);
    void update(int id, Product product);
    Product findById(int id);
    void delete(int id);
    List<Product> searchByName(String name);

}
