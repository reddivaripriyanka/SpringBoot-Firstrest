package com.cg.rest.firstrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.rest.firstrest.employee.Employee;
import com.cg.rest.firstrest.repo.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> getAllEmployee() {
		return repository.findAll();
	}
	
	@Override
	public void addNewEmployee(Employee employee) {
		repository.save(employee);
		
	}

	@Override
	public void UpdateEmployee(Employee employee) {
		repository.save(employee);
		
	}

	@Override
	public void deleteEmployee(int employeeId) {
		Employee employee=repository.getOne(employeeId);
		repository.delete(employee);
		
		
	}

	@Override
	public Optional<Employee> getEmployeeId(int employeeId) {
	 return	repository.findById(employeeId);
		
	}

}
