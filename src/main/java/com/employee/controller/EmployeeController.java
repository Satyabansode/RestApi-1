package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
    private	EmployeeService employeeservice;
	
	@PostMapping("/save")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeservice.createEmployee(employee);
	}
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {
		return employeeservice.getEmployeeById(id);
	}
	
	@GetMapping("/getAll")
	public List<Employee>getAllEmployee(){
		return employeeservice.getAllEmployee();
	}
	
	@PutMapping("/{id}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable Integer id) {
		return employeeservice.updateEmployee(employee, id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		employeeservice.deleteEmployee(id);
	}
}
