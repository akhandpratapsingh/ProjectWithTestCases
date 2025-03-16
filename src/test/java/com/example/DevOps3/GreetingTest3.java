package com.example.DevOps3;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.EnterpriseDevops.EnterpriseDevopsApplication;

@SpringBootTest(classes = EnterpriseDevopsApplication.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GreetingTest3 extends EnterpriseDevopsApplicationTests3 {

	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@BeforeAll
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testAnushGreet() throws Exception {
		mockMvc.perform(get("/greeting?name=Anush")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json"))
				.andExpect(jsonPath("$.name").value("Anush")).andExpect(jsonPath("$.day").value("Monday"));
	}

	@Test
	public void testKumarGreet() throws Exception {
		mockMvc.perform(get("/greeting?name=Kumar")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json"))
				.andExpect(jsonPath("$.name").value("Kumar")).andExpect(jsonPath("$.day").value("Monday"));
	}
}
