package org.sang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2018/7/13.
 */
@RestController
public class HelloController {
    @Autowired
    Hello hello;
    @GetMapping("/hello")
    public String hello() {
        return hello.sayHello("罗贯中");
    }
}
