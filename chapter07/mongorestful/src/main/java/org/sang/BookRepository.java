package org.sang;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by sang on 2018/7/21.
 */
public interface BookRepository extends MongoRepository<Book,Integer> {
}
