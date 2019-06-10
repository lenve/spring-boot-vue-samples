package org.sang;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Chapter013Application {
    @GetMapping("/hello")
    public String hello() {
        return "hello jetty";
    }

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Chapter013Application.class);
        builder.application().setAdditionalProfiles("dev");
        builder.run(args);
//        SpringApplication.run(Chapter013Application.class, args);
    }
}
