package com.niall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niall.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
