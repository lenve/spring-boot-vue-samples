package org.sang;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by sang on 2018/7/5.
 */
@Component
@ConfigurationProperties(prefix = "my")
public class Users {
    private List<User> users;
}
