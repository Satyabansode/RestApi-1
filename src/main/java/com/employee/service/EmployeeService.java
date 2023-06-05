package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {
	
	//create
	public Employee createEmployee(Employee employee);
	
	//getById
	public Employee getEmployeeById(Integer id);
	
	//getAll
	public List<Employee>getAllEmployee();

	//update 
	public Employee updateEmployee(Employee employee,Integer id);
	
	//Delete
	public void deleteEmployee(Integer id);
}
//public Employee createEmployee(Employee employee);----create 
//public List<Employee>getAllEmployee();  ----getAll
//public Employee getEmployeeById(Integer id);   ------getById
//public Employee UpdateEmployee(Employee employee,Integer id);  --Update
//public void deleteEmployee();   -----delete