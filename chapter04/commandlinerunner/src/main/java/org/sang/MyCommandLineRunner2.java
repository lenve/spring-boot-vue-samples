package org.sang;

import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

/**
 * Created by sang on 2018/7/14.
 */
//@Component
//@Order(2)
public class MyCommandLineRunner2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Runner2>>>"+Arrays.toString(args));
    }
}
