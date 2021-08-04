package com.example.astrademoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class AstraDemoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AstraDemoApiApplication.class, args);
    }

}
