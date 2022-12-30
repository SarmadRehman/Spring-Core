package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class test {

	public static void main(String[] args) {

ApplicationContext context = 
new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
demo d = context.getBean("demo",demo.class);
System.out.println(d);
/*
 * instead of spel anotation i.e @Value("#{});
SpelExpressionParser temp = new SpelExpressionParser();
Expression expression =  (Expression) temp.parseExpression("22+44");
System.out.println(expression.getValue());
*/
	}

}
