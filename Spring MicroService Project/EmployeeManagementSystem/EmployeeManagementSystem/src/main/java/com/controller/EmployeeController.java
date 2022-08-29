package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {
@Autowired
	EmployeeService employeeService;
@GetMapping(value ="finda")
public List<Employee>getAllEmployee(){
	return empolyeeService.getAllEmployee();
}
}