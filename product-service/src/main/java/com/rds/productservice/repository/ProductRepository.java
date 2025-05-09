package com.rds.productservice.repository;

import com.rds.productservice.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    List<Product> productsDb = new ArrayList<>();

    public Product addProduct(Product product) {
        productsDb.add(product);
        return product;
    }

    public List<Product> getAllProducts() {
        return productsDb;
    }

    public Product getProductById(long id) {
        return productsDb.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void deleteProductById(long id) {
        productsDb.removeIf(p -> p.getId() == id);
    }

    public Product updateQuantity(long id, int quantity) {
        Product product = getProductById(id);
        if (product != null) {
            product.setQuantity(quantity);
        }
        return product;
    }

}
