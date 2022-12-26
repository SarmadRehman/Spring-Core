package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test { 

	public static void main(String[] args) {
	ApplicationContext con = 
	new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml")  ;
Student student = con.getBean("ob", Student.class); 
System.out.println(student.hashCode());
Student student2 = con.getBean("ob", Student.class);
System.out.println(student2.hashCode());
	}

}
