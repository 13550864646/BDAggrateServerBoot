package com.cloud.mina.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cloud.mina"})
@EnableDiscoveryClient
public class AggregateBootSatrter {

    public static void main(String[] args) {
        SpringApplication.run(AggregateBootSatrter.class, args);
    }

}
