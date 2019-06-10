package org.sang.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class ActuatorApplication {

//    @Scheduled(fixedRate = 2000)
    public void test1() {
        System.out.println("111");
    }

    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }
}
