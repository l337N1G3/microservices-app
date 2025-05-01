package com.niall;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApp {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(DiscoveryServerApp.class, args);
        System.out.println("Eureka Server is running...");
    }
}