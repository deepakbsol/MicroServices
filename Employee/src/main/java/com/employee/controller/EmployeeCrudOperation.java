package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepo;

@RestController
@RequestMapping("/api/employee-server")
public class EmployeeCrudOperation {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@GetMapping("/getAllEmployee")
	public Employee getAllEmployee(@RequestParam int employeeId) {
		System.out.println("employeeId::"+employeeId);
		return employeeRepo.getReferenceById(employeeId);
	}
	
	@PostMapping("/save-employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		System.out.println("employee data-->"+employee);
		return employeeRepo.save(employee);
	}

}
