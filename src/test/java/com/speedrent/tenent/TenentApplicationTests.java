package com.speedrent.tenent;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TenentApplicationTests {
    private MockMvc springMvc;
    @Test
    public void contextLoads() {
    }
    @Autowired
    WebApplicationContext wContext;

    @Before
    public void init() throws Exception
    {
        springMvc = MockMvcBuilders.webAppContextSetup(wContext).build();
    }
    @Test
    public void documentsPollingTest() throws Exception {
        ResultActions resultActions = springMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON));
        resultActions.andDo(MockMvcResultHandlers.print());
    }

}
