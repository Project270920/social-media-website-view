package com.project.view;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.project.view.resources")
public class WebsiteViewApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteViewApplication.class, args);
	}

}
