package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
private double price ;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Pepsi(double price) {
	super();
	this.price = price;
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

public void afterPropertiesSet() throws Exception {
	System.out.println("taking pepsi : init ");
	
}

public void destroy() throws Exception {
	System.out.println("put bottle back after drink : destroy");
	
}

}
