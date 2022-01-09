package com.coffeeshop.example;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coffeeshop.example.service.ServeClientService;

@SpringBootApplication
public class CoffeeShopApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeShopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running it from command line.");
		ServeClientService ser = new ServeClientService();
		ser.placeOrder(Arrays.asList("Capacino","Black"));
	}

}
