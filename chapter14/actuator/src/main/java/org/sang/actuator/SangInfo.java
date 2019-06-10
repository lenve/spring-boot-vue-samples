package org.sang.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;

import java.util.HashMap;
import java.util.Map;

//@Component
public class SangInfo implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String, String> info = new HashMap<>();
        info.put("name", "江南一点雨");
        info.put("email", "wangsong0210@gmail.com");
        builder.withDetail("author", info);
    }
}
