package com.employee.record.employeeRecord;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
@Entity
public class employee_record {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
  public employee_record() {
		// TODO Auto-generated constructor stub
	}
  
	/*public employee_record(int id, String ename, int age, int salary, String designation) {
		super();
		Id = id;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
	}**/
	
}
