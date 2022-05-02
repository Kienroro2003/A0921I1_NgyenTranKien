package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productService;

    @Override
    public List<Product> findAll() {
        return productService.findAll();
    }

    @Override
    public void create(Product product) {
        productService.create(product);
    }

    @Override
    public void update(int id, Product product) {
        productService.update(id, product);
    }

    @Override
    public Product findById(int id) {
        return productService.findById(id);
    }

    @Override
    public void delete(int id) {
        productService.delete(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productService.searchByName(name);
    }
}
