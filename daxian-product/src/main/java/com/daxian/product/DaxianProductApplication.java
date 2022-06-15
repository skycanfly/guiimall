package com.daxian.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@MapperScan("com.daxian.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class DaxianProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaxianProductApplication.class, args);
    }

}
