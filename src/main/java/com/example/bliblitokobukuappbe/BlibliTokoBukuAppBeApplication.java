package com.example.bliblitokobukuappbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.example.bliblitokobukuappbe")
//@EntityScan("com.example.bliblitokobukuappbe.pojos")
//@ComponentScan(basePackages = "com.example.bliblitokobukuappbe")
public class BlibliTokoBukuAppBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlibliTokoBukuAppBeApplication.class, args);
	}

}
