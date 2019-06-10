package org.sang;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by sang on 2018/7/20.
 */
public interface BookDao extends MongoRepository<Book,Integer> {
    List<Book> findByAuthorContains(String author);
    Book findByNameEquals(String name);
}
