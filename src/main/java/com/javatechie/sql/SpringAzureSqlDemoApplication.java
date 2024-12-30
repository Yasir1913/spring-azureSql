package com.javatechie.sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringAzureSqlDemoApplication {

	@Autowired
	private EmployeeRepository employeeRepo;

	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee){
		return employeeRepo.save(employee);
	}
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	}



	public static void main(String[] args) {
		SpringApplication.run(SpringAzureSqlDemoApplication.class, args);
	}

}
