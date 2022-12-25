package com.springcore.ci;

import java.util.List;

public class Person {
private String name ;
private int  personID ;
private Certi certi ;
private List <String> list ;
public Person (String name , int personID, Certi certi, List <String> list ) {
	this.name = name ;
	this.personID = personID ;
	this.certi = certi ;
	this.list =  list ;
	
}
@Override
public String toString() {
	return this.name + " : " + this.personID  + " { " + this.certi.name + " }"
		+ "\n" + this.list	; 
}

}
