package com.example.demo;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class TestingWebApplicationTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void test1() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/index",
				String.class).contains("index.jsp"));
	}

}
