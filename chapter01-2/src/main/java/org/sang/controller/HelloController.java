package org.sang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by sang on 2018/7/4.
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(HttpSession session) {
//        int maxInactiveInterval = session.getMaxInactiveInterval();
//        return String.valueOf(maxInactiveInterval);
        return "hello https!";
    }
    @GetMapping("/error")
    public String error() {
        return "error";
    }
}
