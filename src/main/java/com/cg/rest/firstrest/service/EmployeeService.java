package com.cg.rest.firstrest.service;

import java.util.List;
import java.util.Optional;

import com.cg.rest.firstrest.employee.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();

	void addNewEmployee(Employee employee);


	void UpdateEmployee(Employee employee);

	void deleteEmployee(int employeeId);

	 Optional<Employee> getEmployeeId(int employeeId);

}