package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import com.bean.Employee;
import com.service.EmployeeService;

class EmployeeServiceTest {

	@Test
	@DisplayName("user authentication")
	
	void testCheckUser() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		String result = es.checkUser("raju@gmail.com", "123");
		assertEquals("success", result);
		String result1 = es.checkUser("rajuu@gmail.com", "123");
		assertEquals("failure", result1);
	}

//	@Test
//	
//	void testGetEmployee() {
//		//fail("Not yet implemented");
//		EmployeeService es = new EmployeeService();
//		Employee emp = es.getEmployee();
//		assertNotNull(emp);
//		assertEquals(1, emp.getId());
//		assertEquals("Raju", emp.getName());
//		assertEquals(27000, emp.getSalary());
//	}
//	@Test
//	
//	void testListOfEmployee() {
//		//fail("Not yet implemented");
//		EmployeeService es = new EmployeeService();
//		List<Employee> listOfEmp = es.listofEmployee();
//		assertEquals(2, listOfEmp.size());
//	}
//	@Test
//	
//	void testPassEmployeeObject() {
//		EmployeeService es = new EmployeeService();
//		Employee emp = new Employee();
//		emp.setId(1);
//		emp.setName("Raju");
//		emp.setSalary(27000);
//		float updatedSalary =es.passEmployeeObject(emp);
//		assertEquals(27500, updatedSalary);
//	}

}
