package com.employee.record.employeeRecord;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class employee_record_implimentation implements employeeService{

	@Autowired
	employee_record_service employee_record_service;
	
	@Override 

	public List<employee_record> fetchEmployeeList()
	{
		return (List<employee_record>)employee_record_service.findAll(); 
	}
}
