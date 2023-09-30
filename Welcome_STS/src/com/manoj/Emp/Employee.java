package com.manoj.Emp;

public class Employee {

	private int Id;
	private String ename;
	private int age;
	private int salary;
	private String designation;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(int id, String ename, int age, int salary, String designation) {
		super();
		Id = id;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", ename=" + ename + ", age=" + age + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
	
	
}
