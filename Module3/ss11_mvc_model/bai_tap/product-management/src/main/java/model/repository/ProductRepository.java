package model.repository;

import model.bean.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(int id);
    void update(int id,Product product);
    void delete(int id);
    void save(Product product);
    List<Product> findByName(String name);


}
