package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.Person;

public class test {

	public static void main(String[] args) {
		
ApplicationContext con = 
new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml") ;
person person11  = (person) con.getBean("person1");
System.out.println(person11);
System.out.println(person11.getFriends().getClass().getName());
System.out.println("--------------------------------------------");
System.out.println(person11.getFeestruct());
System.out.println("--------------------------------------------");
System.out.println(person11.getProperties());
	} 

}
