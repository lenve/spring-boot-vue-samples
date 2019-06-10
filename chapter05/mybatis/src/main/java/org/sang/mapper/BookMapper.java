package org.sang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sang.model.Book;

import java.util.List;

/**
 * Created by sang on 2018/7/15.
 */
@Mapper
public interface BookMapper {
    int addBook(Book book);
    int deleteBookById(Integer id);
    int updateBookById(Book book);
    Book getBookById(Integer id);
    List<Book> getAllBooks();
}
