package org.sang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodbApplicationTests {

	@Autowired
	MongoTemplate mongoTemplate;
	@Test
	public void test1() {
		List<Book> all = mongoTemplate.findAll(Book.class);
		System.out.println(all);
	}
	@Test
	public void contextLoads() {
		Book book = new Book();
		book.setName("三国演义");
		book.setAuthor("罗贯中");
		book.setId(1);
		mongoTemplate.save(book);
		List<Book> list = mongoTemplate.findAll(Book.class);
		System.out.println(list);
	}
}
