package org.sang.test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    BaseHelloService baseHelloService;
    public String sayHello(String name) {
//        return baseHelloService.sayHello(name);
        return "Hello " + name + " !";
    }
}
