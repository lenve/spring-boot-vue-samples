package org.sang.test01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
//@SpringBootTest
public class MyWebMvcTest {
    @Autowired
    MockMvc mockMvc;
    @MockBean(name = "helloController")
    HelloService helloService;
    @Test
    public void test1() throws Exception {
        String hello = helloService.sayHello("Michael");
        System.out.println(hello);
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/hello")).andDo(MockMvcResultHandlers.print()).andReturn();
        System.out.println(">>>"+mvcResult.getResponse().getContentAsString());
    }
}
