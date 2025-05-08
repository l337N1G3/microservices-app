package com.niall.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niall.model.Product;
import com.niall.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public String createProduct(Product product) {
        return productRepository.save(product).getId();
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

}
