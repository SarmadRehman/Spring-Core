package com.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class demoMain {

	public static void main(String[] args) {
		ApplicationContext context =
				new  AnnotationConfigApplicationContext(javaConfig.class);
		
      Student student = context.getBean("koiBaal", Student.class) ;
      System.out.println(student);
      student.Study();
		}

}
