package model.service.impl;

import model.bean.Product;
import model.repository.ProductRepository;
import model.repository.impl.ProductRepositoryImpl;
import model.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepository repository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        repository.update(id, product);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public void save(Product product) {
        repository.save(product);
    }

    @Override
    public List<Product> findByName(String name) {
        return repository.findByName(name);

    }
}
