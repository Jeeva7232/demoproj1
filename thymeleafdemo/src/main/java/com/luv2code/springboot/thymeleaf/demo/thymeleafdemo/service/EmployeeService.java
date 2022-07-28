package com.luv2code.springboot.thymeleaf.demo.thymeleafdemo.service;

import java.util.List;

import com.luv2code.springboot.thymeleaf.demo.thymeleafdemo.entiry.Employee;


public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
}
