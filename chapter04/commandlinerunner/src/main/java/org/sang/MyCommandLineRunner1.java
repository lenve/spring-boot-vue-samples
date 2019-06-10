package org.sang;

import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

/**
 * Created by sang on 2018/7/14.
 */
//@Component
//@Order(1)
public class MyCommandLineRunner1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Runner1>>>"+Arrays.toString(args));
    }
}
