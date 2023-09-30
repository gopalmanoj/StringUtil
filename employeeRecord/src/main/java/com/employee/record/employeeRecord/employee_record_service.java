package com.employee.record.employeeRecord;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface employee_record_service extends CrudRepository<employee_record, Integer> {

	
}
