package com.springcore.springcore;

public class student {
private int studentID;
private String  studentName;
private String studentAddress;

	



	public student(int studentID, String studentName, String studentAddress) {
	super();
	this.studentID = studentID;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
}

	public int getStudentID() {
	return studentID;
}

public void setStudentID(int studentID) {
	this.studentID = studentID;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getStudentAddress() {
	return studentAddress;
}

public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
@Override
public String toString() {
	return "student [studentID=" + studentID + ", studentName=" + studentName + ", studentAddress=" + studentAddress
			+ "]";
}

public student() {
super();
// TODO Auto-generated constructor stub
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
