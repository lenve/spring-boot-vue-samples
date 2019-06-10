package org.sang.redisclustercache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable(value = "c1")
    public String getNameById(Integer id) {
        return "Michael";
    }
}
