package com.niteen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import com.niteen.bean.UserBean;
import com.niteen.controller.SchoolController;

@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
class SchoolServiceApplicationTests {
	@Autowired
	private SchoolController schoolController;
	@LocalServerPort
	private int port;
	@Autowired
	private TestRestTemplate restTemplate;
	@Test
	void contextLoads() {
		assertTrue(schoolController!=null);
	}
	@Test
	public void testWelcomeSchool() {
		//assertEquals(schoolController, restTemplate, null);
		String message = this.restTemplate.getForObject("http://localhost:"+ port + "/", String.class);
		System.out.println(message);
		assertTrue(message.contains("Hello Everyone,Welcome back to school your best childhood memories....!!!!"));
		
	}
	@Test
	public void testGetUserById() {
		UserBean user = this.restTemplate.getForObject("http://localhost:"+ port + "/getUserById/101", UserBean.class);
		System.out.println(user);
		assertTrue(user.getName().equals("Ram"));
	}

}
