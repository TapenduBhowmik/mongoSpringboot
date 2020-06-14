package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeeService;
	
	@RequestMapping(value = "/employee",method = RequestMethod.POST)
	public Employee saveEmployee(@RequestBody Employee emp) {
		
		Employee empl = this.employeeeService.saveEmployee(emp);
		
		return empl;
		
	}
	
	@RequestMapping(value = "/employee",method = RequestMethod.GET)
	public List<Employee> getAllEmployee() {
		
		List<Employee> empl = this.employeeeService.getAllEmployee();
		
		return empl;
		
	}
}
