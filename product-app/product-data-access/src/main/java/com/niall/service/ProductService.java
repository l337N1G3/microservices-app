package com.niall.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niall.model.Product;

@Service

public interface ProductService {

    String createProduct(Product product);

    // Other service methods can be defined here

    List<Product> findAllProducts();

}
