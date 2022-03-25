package model.repository.impl;

import model.bean.Product;
import model.repository.ProductRepository;
import model.service.ProductService;

import java.util.*;

public class ProductRepositoryImpl implements ProductRepository {
    static private Map<Integer, Product> map = new HashMap<>();

    static {
        map.put(1, new Product(1, "ban phim", 2000000, "blue switch", "keychron"));
        map.put(2, new Product(2, "ban phim", 2000000, "blue switch", "keychron"));
        map.put(3, new Product(3, "ban phim", 2000000, "blue switch", "keychron"));
        map.put(4, new Product(4, "ban phim", 2000000, "blue switch", "keychron"));
        map.put(5, new Product(5, "ban phim", 2000000, "blue switch", "keychron"));
        map.put(6, new Product(6, "ban phim", 2000000, "blue switch", "keychron"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Product findById(int id) {
        return map.get(id);
    }

    @Override
    public void update(int id, Product product) {
        map.put(id, product);
    }

    @Override
    public void delete(int id) {
        map.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> list = new LinkedList<>();
        for(Product product : map.values()){
            if(product.getProductName().equals(name)){
                list.add(product);
            }
        }
        return list;
    }

    @Override
    public void save(Product product) {
        map.put(product.getProductId(), product);
    }
}
