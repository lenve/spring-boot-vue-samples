package org.sang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sang on 2018/7/20.
 */
@RestController
public class BookController {
    @Autowired
    BookDao bookDao;
    @Autowired
    MongoTemplate mongoTemplate;

    @GetMapping("/test2")
    public void test2() {
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setId(3);
        b1.setName("围城");
        b1.setAuthor("钱钟书");
        books.add(b1);
        Book b2 = new Book();
        b2.setId(4);
        b2.setName("宋诗选注");
        b2.setAuthor("钱钟书");
        books.add(b2);
        mongoTemplate.insertAll(books);
        List<Book> list = mongoTemplate.findAll(Book.class);
        System.out.println(list);
        Book book = mongoTemplate.findById(3, Book.class);
        System.out.println(book);
    }

    @GetMapping("/test1")
    public void test1() {
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setId(1);
        b1.setName("朝花夕拾");
        b1.setAuthor("鲁迅");
        books.add(b1);
        Book b2 = new Book();
        b2.setId(2);
        b2.setName("呐喊");
        b2.setAuthor("鲁迅");
        books.add(b2);
        bookDao.insert(books);
        List<Book> books1 = bookDao.findByAuthorContains("鲁迅");
        System.out.println(books1);
        Book book = bookDao.findByNameEquals("朝花夕拾");
        System.out.println(book);
    }
}
