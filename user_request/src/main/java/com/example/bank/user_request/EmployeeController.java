package com.example.bank.user_request;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

	@GetMapping("/emp")
	public List<Employee> getEmployee()
	{
		
		Employee e1=new Employee(1, "Gopal", 50, 500000, "TL");
		Employee e2=new Employee(2, "Govind", 55, 550000, "TL");
		Employee e3=new Employee(3, "Krishna", 45, 5700000, "manager");
		Employee e4=new Employee(4, "Kanhaiya", 57, 530000, "manager");
		Employee e5=new Employee(5, "Radhe", 47, 5500000, "manager");
		Employee e6=new Employee(6, "KrishanPiyari", 45, 5300000, "Senior Developer");
		Employee e7=new Employee(7, "NandNadan", 35, 400000, "developer");
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		
		return list;
	}
	@RequestMapping("/")
	public String getMessage()
	{
		return "Welcome To the check message";
	}
}
