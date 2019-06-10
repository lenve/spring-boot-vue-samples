package org.sang.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;
//        return Health.status("FATAL").withDetail("msg", "应用濒临崩溃...").build();

//@Component
public class SangHealth implements HealthIndicator {
    @Override
    public Health health() {
//        return Health.status("FATAL").withDetail("msg", "网络断开...").build();
        return Health.up().withDetail("msg", "网络连接正常...").build();
    }
}