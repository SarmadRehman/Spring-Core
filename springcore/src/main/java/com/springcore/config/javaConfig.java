package com.springcore.config;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfig {
	@Bean
	public Samosa getsamosa() {
		return new Samosa() ;
	}
	
	
	@Bean(name = {"student", "temp", "koiBaal"})
public Student getstudent() {
	Student student = new Student(getsamosa()) ;
	return student ;
	
}
}
