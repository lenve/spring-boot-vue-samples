package org.sang;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * Created by sang on 2018/7/6.
 */
public class MyEnv implements EnvironmentAware {
    Environment environment;
    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
    public void printEnv() {
        System.out.println(environment.getProperty("JAVA_HOME"));
        System.out.println(environment.getProperty("CLASSPATH"));
        System.out.println(environment.getProperty("CLASSPATH"));


    }
}
