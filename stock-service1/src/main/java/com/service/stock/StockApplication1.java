package com.service.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StockApplication1 {
	public static void main(String[] args) {
		SpringApplication.run(StockApplication1.class, args);
	}
}
