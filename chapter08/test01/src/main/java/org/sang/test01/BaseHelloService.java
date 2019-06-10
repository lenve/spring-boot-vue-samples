package org.sang.test01;

import org.springframework.stereotype.Service;

@Service
public class BaseHelloService {
    public String sayHello(String name) {
        return "Hello " + name + " !";
    }
}
