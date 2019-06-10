package org.sang.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sang.aop.model.User;
import org.sang.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopApplicationTests {

    @Autowired
    UserService userService;
    @Test
    public void contextLoads() {
//        String s = userService.getUserById(1);
//        System.out.println("s:"+s);
        userService.deleteUserById(1);
    }

}
