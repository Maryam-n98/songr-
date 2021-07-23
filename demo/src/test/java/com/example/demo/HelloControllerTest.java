package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class HelloControllerTest {

        @Autowired
        private MockMvc mockMvc;
        @Autowired
        HelloController helloController;
        @Autowired
        TestRestTemplate testRestTemplate;

        @LocalServerPort
        private int port;
        @Test
        public void loading() throws Exception{
            assertThat(helloController).isNotNull();
        }

    @Test
    public void testHello() throws Exception{
        assertThat(this.testRestTemplate.getForObject("http://localhost/:" + port+ "/hello",
                String.class)).contains("Hello World");
    }

    @Test
    public void testRequestStatus() throws Exception{
        this.mockMvc.perform(get("/hello")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello World")));
    }

    }
