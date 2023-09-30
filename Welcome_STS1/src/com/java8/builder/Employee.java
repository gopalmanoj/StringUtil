package com.java8.builder;

public class Employee {
private int Id,salary;
private String name;
public Employee(int id, int salary, String name) {
	super();
	Id = id;
	this.salary = salary;
	this.name = name;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



}
