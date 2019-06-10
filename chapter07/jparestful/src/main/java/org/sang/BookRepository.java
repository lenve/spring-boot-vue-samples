package org.sang;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * Created by sang on 2018/7/20.
 */
@CrossOrigin
@RepositoryRestResource(path = "bs",collectionResourceRel = "bs",itemResourceRel = "b")
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Override
    @RestResource(exported = false)
    void deleteById(Integer integer);

    @RestResource(path = "author",rel = "author")
    List<Book> findByAuthorContains(@Param("author") String author);
    @RestResource(path = "name",rel = "name")
    Book findByNameEquals(@Param("name") String name);
}
