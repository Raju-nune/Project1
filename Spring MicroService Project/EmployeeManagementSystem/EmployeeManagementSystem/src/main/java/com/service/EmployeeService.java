package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;

import antlr.collections.List;

@Service
public class EmployeeService {
@Autowired
	EmployeeDao employeeDao;
public List<Employee> getAllEmployee(){
	return employeeDao.findAll();
}
}
