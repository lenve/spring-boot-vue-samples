package org.sang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2018/7/18.
 */
@RestController
public class BookController {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @GetMapping("/test1")
    public void test1() {
        ValueOperations ops = redisTemplate.opsForValue();
        Book book = new Book();
        book.setName("水浒传");
        book.setAuthor("施耐庵");
        ops.set("b1", book);
        System.out.println(ops.get("b1"));
        ValueOperations<String, String> ops2 = stringRedisTemplate.opsForValue();
        ops2.set("k1", "v1");
        System.out.println(ops2.get("k1"));
    }
}
