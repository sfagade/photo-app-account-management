package com.apps.developer.blog.phot.accountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoAppUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppUserServiceApplication.class, args);
    }

}
