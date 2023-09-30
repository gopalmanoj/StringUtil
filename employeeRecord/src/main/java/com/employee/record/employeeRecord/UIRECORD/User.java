package com.employee.record.employeeRecord.UIRECORD;

public class User {
private String lname;
private String fname;

private String dob;
private String gender;
private String pass;
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
@Override
public String toString() {
	return "User [lname=" + lname + ", fname=" + fname + ", dob=" + dob + ", gender=" + gender + ", pass=" + pass + "]";
}

}
