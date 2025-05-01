package com.niall;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGateway {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(ApiGateway.class, args);
        System.out.println("API Gateway is running...");
    }
}