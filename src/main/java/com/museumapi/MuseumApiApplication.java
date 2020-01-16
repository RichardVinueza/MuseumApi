package com.museumapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.museumapi.controllers.UserController;

@SpringBootApplication
@ComponentScan(basePackages= {"com.museumapp"})
@ComponentScan(basePackageClasses = UserController.class)
public class MuseumApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuseumApiApplication.class, args);
		
	}
	
	@Configuration
	public class MvcConfig implements WebMvcConfigurer {
	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry
	          .addResourceHandler("/jreports/**")
	          .addResourceLocations("classpath:/jreports/"); 
	    }
	}

}
