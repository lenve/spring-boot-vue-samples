package org.sang.test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public HelloController() {
        System.out.println(">>>HelloController");
    }

    @GetMapping("/test1")
    public void test1() {

    }

    @Autowired
    HelloService helloService;
    @GetMapping("/hello")
    public String hello(String name) {
        return helloService.sayHello(name);
    }

    @PostMapping("/book")
    public String addBook(@RequestBody Book book) {
        return book.toString();
    }
}
