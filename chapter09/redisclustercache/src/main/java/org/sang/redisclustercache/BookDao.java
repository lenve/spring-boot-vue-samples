package org.sang.redisclustercache;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
    @Cacheable(value = "c1")
    public String getBookById(Integer id) {
        System.out.println("getBookById");
        return "这本书是三国演义";
    }
    @CachePut(value = "c1")
    public String updateBookById(Integer id) {
        return "这是全新的三国演义";
    }
    @CacheEvict(value = "c1")
    public void deleteById(Integer id) {
        System.out.println("deleteById");
    }
    @Cacheable(value = "c2")
    public String getBookById2(Integer id) {
        System.out.println("getBookById2");
        return "这本书是红楼梦";
    }
}
