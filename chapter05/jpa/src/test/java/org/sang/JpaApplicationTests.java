package org.sang;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sang.dao.BookDao;
import org.sang.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

	@Autowired
	BookDao bookDao;
	@Test
	public void contextLoads() {
		List<Book> all = bookDao.findAll();
		System.out.println(all);
		List<Book> booksByIdAndName = bookDao.getBooksByIdAndName("三", 10);
		System.out.println(booksByIdAndName);
	}
}
