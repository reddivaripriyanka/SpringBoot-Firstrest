package com.cg.rest.firstrest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.rest.firstrest.employee.Employee;
import com.cg.rest.firstrest.employee.address.Address;
import com.cg.rest.firstrest.repo.EmployeeRepository;

@SpringBootApplication
public class FirstRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstRestApplication.class, args);
	}
	@Bean
	public CommandLineRunner popularData(EmployeeRepository repository) {
		return (arg)->{
			repository.save(new Employee(101,"priya",25,new Address("chittor",517125,234)));
			repository.save(new Employee(102,"priya",25,new Address("chittor",517125,234)));
			repository.save(new Employee(103,"priya",25,new Address("chittor",517125,234)));
			repository.save(new Employee(104,"priya",25,new Address("chittor",517125,234)));
		};
	}

}

