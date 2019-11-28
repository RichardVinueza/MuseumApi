package com.museumapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.museumapi.controllers.UserController;

@SpringBootApplication
@ComponentScan(basePackages= {"com.museumapp"})
@ComponentScan(basePackageClasses = UserController.class)
public class MuseumApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuseumApiApplication.class, args);
	}

}
