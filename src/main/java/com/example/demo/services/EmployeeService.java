package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.env.RandomValuePropertySource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;


@Component
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Transactional
	public Employee saveEmployee(Employee emp) {
		
		
		Employee employee = this.employeeRepository.save(emp);
		
		return employee;
		
	}
	
	@Transactional
	public List<Employee> getAllEmployee() {
		
		
		List<Employee> employees = this.employeeRepository.findAll();
		
		return employees;
		
	}

}
