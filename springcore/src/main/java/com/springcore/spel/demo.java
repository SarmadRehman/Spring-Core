package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class demo {
	@Value("#{22+11}")
private int x;
private int y;
@Value("#{T(Math).sqrt(144)}")
private int z;
@Value("#{T(Math).E}")
private double e;
@Value("#{T(Math).PI}")
private double PI;
@Value("#{new String ('Sarmad Rehman')}")
private String myName;
@Value("#{5>2}")
private boolean isActive;




public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}

public int getZ() {
	return z;
}
public void setZ(int z) {
	this.z = z;
}

public int getE() {
	return e;
}
public void setE(int e) {
	this.e = e;
}
public int getPI() {
	return PI;
}
public void setPI(int pI) {
	PI = pI;
}
public String getMyName() {
	return myName;
}
public void setMyName(String myName) {
	this.myName = myName;
}
@Override
public String toString() {
	return "demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", PI=" + PI + ", myName=" + myName + ", isActive="
			+ isActive + "]";
}




 

}
