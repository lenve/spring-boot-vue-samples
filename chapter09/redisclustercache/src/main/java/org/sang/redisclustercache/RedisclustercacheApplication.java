package org.sang.redisclustercache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisclustercacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedisclustercacheApplication.class, args);
    }
}
