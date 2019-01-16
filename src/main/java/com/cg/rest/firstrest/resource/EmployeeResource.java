package com.cg.rest.firstrest.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.firstrest.employee.Employee;
import com.cg.rest.firstrest.service.EmployeeService;

@RestController
@RequestMapping("/employees") //Addressable Resource
public class EmployeeResource {
	@Autowired
	private EmployeeService service;

	@PostMapping  //uniform Constrain Interface
	public void addNewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);
	}

	@GetMapping //Uniform Constrain Interface
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}
	@PutMapping
	public void upadateEmployee(@RequestBody Employee employee)
	{
	service.UpdateEmployee(employee);
	}
	@DeleteMapping("/{employeeId}")
	public void DeleteEmployee(@PathVariable int employeeId) {
		service.deleteEmployee(employeeId);
	}
	@GetMapping("/{employeeId}")
	public Optional<Employee> getEmployeeId(@PathVariable int employeeId) {
	return service.getEmployeeId(employeeId);
	}
	
}
