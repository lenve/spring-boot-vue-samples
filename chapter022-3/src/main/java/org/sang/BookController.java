package org.sang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2018/7/6.
 */
@RestController
public class BookController {
    @Autowired
    Book book;
    @GetMapping("/book")
    public String book() {
        return book.toString();
    }
}
