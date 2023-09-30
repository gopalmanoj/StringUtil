package com.employee.record.employeeRecord;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employee_record_Controller {

	
	@Autowired
	employeeService em;
	
	@GetMapping("/employee_r")
	
	public List<employee_record> fetchEmployeeList(){
		
		return em.fetchEmployeeList();
	}
	
	@GetMapping("/hello")
	public String getMessage()
	{
		return "Hello, Dear Employee Welcome Our Company ?";
	}
}
