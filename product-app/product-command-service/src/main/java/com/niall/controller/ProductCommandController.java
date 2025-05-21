package com.niall.controller;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niall.request.ProductRequest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/products")
public class ProductCommandController {
    private final Environment environment;

    public ProductCommandController(Environment environment) {
        this.environment = environment;
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductRequest productRequest) {
        log.info("Create product command received: {}", productRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body("Product created successfully");
    }

}
