package com.test;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.user.UserAuthenticate;

class UserAuthenticateTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Checking User details")
	void testCheckuser() {
		//fail("Not yet implemented");
		UserAuthenticate es = new UserAuthenticate();
		String result=es.checkuser("raju@gmail.com", "777");
		assertEquals("success", result);
		
		String result1=es.checkuser("raj@gmail.com", "123");
		assertEquals("failure", result1);
		
		String result2=es.checkuser("raju@gmail.com", "1234");
		assertEquals("failure", result2);
		
		String result3=es.checkuser("rajuu@gmail.com", "1234");
		assertEquals("failure", result3);
	}

}
