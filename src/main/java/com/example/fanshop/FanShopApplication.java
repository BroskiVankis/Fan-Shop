package com.example.fanshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FanShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(FanShopApplication.class, args);
	}

}
