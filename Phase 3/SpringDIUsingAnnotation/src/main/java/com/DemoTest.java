package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// enable  using xml file
//		ApplicationContext ac =new ClassPathXmlApplicationContext("beans.xml");
//		Address add1 = (Address)ac.getBean("address");
//		System.out.println(add1);
//		Employee emp1 = (Employee)ac.getBean("employee");
//		System.out.println(emp1);
//		add1.setCity("kalyandurg");
//		add1.setState("ap");
//		emp1.setName("raju");
//		emp1.setId(2);
//		emp1.setSalary(10000);
//		System.out.println(emp1);
//		System.out.println(add1);
		
//		enable using annotation configuration
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Address add1 = (Address)ac.getBean("address");
		System.out.println(add1);
		Employee emp1 = (Employee)ac.getBean("employee");
		System.out.println(emp1);
		Product p= (Product)ac.getBean("pp");
		p.productInfo();
	}

}
