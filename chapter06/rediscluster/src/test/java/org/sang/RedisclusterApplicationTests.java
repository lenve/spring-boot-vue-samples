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
public class RedisclusterApplicationTests {

	@Autowired
	RedisTemplate redisTemplate;
	@Autowired
	StringRedisTemplate stringRedisTemplate;

	@Test
	public void contextLoads() {
		ValueOperations ops = redisTemplate.opsForValue();
		Book value = new Book();
		value.setName("水浒传");
		value.setAuthor("男");
		ops.set("name", value);
		System.out.println(ops.get("name"));
		ValueOperations<String, String> ops2 = stringRedisTemplate.opsForValue();
		ops2.set("k1", "v1");
		System.out.println(ops2.get("k1"));
	}

}
