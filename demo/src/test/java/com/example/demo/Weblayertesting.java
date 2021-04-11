package com.example.demo;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(Controller_.class)
@Secured(value = { "USER" })
class Weblayertesting {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void Test2() throws Exception {
		this.mockMvc.perform(get("/index")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("index.jsp")));
	}

}
