package org.sang.security01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Security01ApplicationTests {

    @Autowired
    RegService regService;

    @Test
    public void contextLoads() {
        regService.reg("aaa", "123");
    }

}
