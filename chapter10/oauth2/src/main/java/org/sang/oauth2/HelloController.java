package org.sang.oauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/admin/hello")
    public String admin() {
        return "Hello admin!";
    }
    @GetMapping("/user/hello")
    public String user() {
        return "Hello user!";
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
