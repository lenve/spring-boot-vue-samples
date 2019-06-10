package org.sang.redisclustercache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class RedisCacheConfig {
    @Autowired
    RedisConnectionFactory conFactory;

    @Bean
    RedisCacheManager redisCacheManager() {
        Map<String, RedisCacheConfiguration> configMap = new HashMap<>();
        RedisCacheConfiguration redisCacheConfig =
                RedisCacheConfiguration.defaultCacheConfig()
                        .prefixKeysWith("sang:")
                        .disableCachingNullValues()
                        .entryTtl(Duration.ofMinutes(30));
        configMap.put("c1", redisCacheConfig);
        RedisCacheWriter cacheWriter =
                RedisCacheWriter.nonLockingRedisCacheWriter(conFactory);
        RedisCacheManager redisCacheManager =
                new RedisCacheManager(
                        cacheWriter,
                        RedisCacheConfiguration.defaultCacheConfig(),
                        configMap);
        return redisCacheManager;
    }
}
