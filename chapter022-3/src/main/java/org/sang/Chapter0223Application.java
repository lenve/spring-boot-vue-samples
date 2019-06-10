package org.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Book.class)
public class Chapter0223Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter0223Application.class, args);
	}
}
