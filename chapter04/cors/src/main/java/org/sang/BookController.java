package org.sang;

import org.springframework.web.bind.annotation.*;

/**
 * Created by sang on 2018/7/12.
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @PostMapping("/")
//    @CrossOrigin(value = "http://localhost:8081"
//            ,maxAge = 1800,allowedHeaders = "*")
    public String addBook(String name) {
        return "receive:" + name;
    }
    @DeleteMapping("/{id}")
//    @CrossOrigin(value = "http://localhost:8081"
//            ,maxAge = 1800,allowedHeaders = "*")
    public String deleteBookById(@PathVariable Long id) {
        return String.valueOf(id);
    }
}
