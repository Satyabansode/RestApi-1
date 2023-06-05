package com.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public Employee createEmployee(Employee employee) {
	Employee empl = employeeRepo.save(employee);
		return empl;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Employee employee = employeeRepo.findById(id).get();
 		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
         List<Employee> findAll = employeeRepo.findAll();
         return findAll ;
	}

	@Override
	public Employee updateEmployee(Employee employee, Integer id) {
		Employee employee2 = employeeRepo.findById(id).get();
		
		employee2.setName(employee.getName());
		employee2.setLastname(employee.getLastname());
		
		Employee save = employeeRepo.save(employee);
		return save;
	}

	@Override
	public void deleteEmployee(Integer id) {
    employeeRepo.deleteById(id);		
	}

}
