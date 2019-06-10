package org.sang.test01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
//@SpringBootTest
@ContextConfiguration(classes = Test01Application.class)
public class AppTest {
//    @Autowired
    @MockBean(name = "helloService")
    BaseHelloService baseHelloService;
    @Test
    public void test1() {
        String hello = baseHelloService.sayHello("Michael");
        System.out.println(hello);
//        given(this.baseHelloService.sayHello("Michael")).willReturn("Hello Michael !22222");
    }
}
