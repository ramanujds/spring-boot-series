package com.rds.productservice.service;

import com.rds.productservice.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productServicev2")
public class ProductServiceImplV2 implements ProductService {
    public Product addProduct(Product product) {
        return null;
    }

    public List<Product> getAllProducts() {
        return List.of();
    }

    public Product getProductById(long id) {
        return null;
    }

    public void deleteProductById(long id) {

    }

    public Product updateQuantity(long id, int quantity) {
        return null;
    }
}
