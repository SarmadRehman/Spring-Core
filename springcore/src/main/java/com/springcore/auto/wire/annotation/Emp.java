package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address2")
	// @Qualifier("address1")
private Address address ;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
	System.out.println("inside setter method");
}

public Emp() {
	super();
	System.out.println("inside non-parameterized constructor");
}

public Emp(Address address) {
	
	super();
	this.address = address;
	System.out.println("inside parameterized constructor");
}

@Override
public String toString() {
	return "Emp [address=" + address +  "]";
}



}
