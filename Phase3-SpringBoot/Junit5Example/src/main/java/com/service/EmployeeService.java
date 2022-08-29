package com.service;

import java.util.ArrayList;
import java.util.List;

//import com.bean.Employee;

public class EmployeeService {
public String checkUser(String emailid, String password) {
	if(emailid.equals("raju@gmail.com")&& password.contentEquals("123")) {
		return "success";
	}
	else {
		return "failure";
	}
}
//public Employee getEmployee() {
//	Employee emp = new Employee();
//	emp.setId(1);
//	emp.setName("Raju");
//	emp.setSalary(27000);
//	return emp;
//}
//public List<Employee> listofEmployee(){
//	List<Employee> listofEmp = new ArrayList<Employee>();
//	Employee emp1 = new Employee();
//	emp1.setId(2);
//	emp1.setName("Raj");
//	emp1.setSalary(30000);
//	
//	Employee emp2 = new Employee();
//	emp2.setId(3);
//	emp2.setName("Sathya");
//	emp2.setSalary(30000);
//	listofEmp.add(emp1);
//	listofEmp.add(emp2);
//	return listofEmp;
//	
//}
//public float passEmployeeObject(Employee emp) {
//	return emp.getSalary()+500;
//}
//
}

