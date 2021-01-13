package de.telran.hellowebservlett.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void giventUrl_whenGetRequest_thenFindGetResponse()
            throws Exception {

        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders
                .get("/api/hello-simple/olga");

        ResultMatcher contentMatcher = MockMvcResultMatchers.content()
                .string("Hello Simple:olga");

        this.mockMvc.perform(builder).andExpect(contentMatcher)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
