package com.example.employee;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class EmployeeApplicationTests {
	
	protected RestTemplate restTemplate = new RestTemplate();
	protected final String DEFAULT_URL = "http://localhost:8082/";
	
	@Test
	void contextLoads() {
	}

}
