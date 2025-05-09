package com.rds.productservice.service;

import com.rds.productservice.model.Product;
import com.rds.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service("productServicev1")
@Primary
public class ProductServiceImpl implements ProductService {


    private ProductRepository productRepository;
    private Scanner scanner;


    public ProductServiceImpl(ProductRepository productRepository, Scanner scanner) {
        this.productRepository = productRepository;
        this.scanner = scanner;
    }


    public Product addProduct(Product product) {
        String name = scanner.nextLine();
        System.out.println(name);
        return productRepository.addProduct(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    public Product getProductById(long id) {
        return productRepository.getProductById(id);
    }

    public void deleteProductById(long id) {
        productRepository.deleteProductById(id);
    }

    public Product updateQuantity(long id, int quantity) {
        return productRepository.updateQuantity(id, quantity);
    }
}
