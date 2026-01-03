package com.tp.microservices_resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroServicesRestTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServicesRestTemplateApplication.class, args);
    }

}
