package com.akshay.example.explore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class ExploreApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ExploreApplication.class, args);
		System.out.println("Registration Form!");
	}
}
