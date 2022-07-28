package com.luv2code.springboot.thymeleaf.demo.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleaf.demo.thymeleafdemo.entiry.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findAllByOrderByFirstNameAsc();
}
