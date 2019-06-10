package org.sang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sang.mapper1.BookMapper;
import org.sang.mapper2.BookMapper2;
import org.sang.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultimybatisApplicationTests {

	@Autowired
	BookMapper bookMapper;

	@Autowired
	BookMapper2 bookMapper2;

	@Test
	public void contextLoads() {
		List<Book> allBooks = bookMapper.getAllBooks();
		System.out.println(allBooks);
		System.out.println(bookMapper2.getAllBooks());
	}

}
