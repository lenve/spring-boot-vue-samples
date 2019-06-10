package org.sang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

	@Autowired
	StringRedisTemplate stringRedisTemplate;
	@Autowired
	RedisTemplate redisTemplate;
	@Test
	public void contextLoads() {
		ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
		ops.set("k1", "v1");
//		ValueOperations ops = redisTemplate.opsForValue();
//		Book b1 = new Book();
//		b1.setId(1);
//		b1.setAuthor("罗贯中");
//		b1.setName("三国演义");
//		ops.set("b1", b1);
//		Book b11 = (Book) ops.get("b1");
//		System.out.println(b11);
//		ClusterOperations cluster = redisTemplate.opsForCluster();
	}

}
