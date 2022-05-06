package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ProductRepository implements IProductRepository {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "sach", 6000, "o ly", "Dong Tien"));
        products.put(2, new Product(2, "thuoc la", 12000, "trang", "Thang Long"));
        products.put(3, new Product(3, "sach", 7000, "xanh", "Cat"));
        products.put(4, new Product(4, "sach", 8000, "vang", "prince"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void create(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> search = new ArrayList<>();
        for (Product searchName : products.values()) {
            if (searchName.getName().equals(name)) {
                search.add(searchName);
            }
        }
        return search;
    }
}
