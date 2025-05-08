package com.niall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductDataAccessApp {
    public static void main(String[] args) {
        SpringApplication.run(ProductDataAccessApp.class, args);
        System.out.println("Product Data Access App is running...");
    }
}