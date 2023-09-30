package com.manoj.Emp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeRecords {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		Employee e1=new Employee(1, "Gopal", 50, 500000, "TL");
		Employee e2=new Employee(2, "Govind", 55, 550000, "TL");
		Employee e3=new Employee(3, "Krishna", 45, 5700000, "manager");
		Employee e4=new Employee(4, "Kanhaiya", 57, 530000, "manager");
		Employee e5=new Employee(5, "Radhe", 47, 5500000, "manager");
		Employee e6=new Employee(6, "KrishanPiyari", 45, 5300000, "Senior Developer");
		Employee e7=new Employee(7, "NandNadan", 35, 400000, "developer");
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		
List<Employee> l=list.stream().filter(p->p.getDesignation().equals("manager") & p.getAge()>45).collect(Collectors.toList());
System.out.print(l); 
	}

}
