package com.kiwilio.springrestexample.controller;

import com.kiwilio.springrestexample.data.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/book")
    public Book getBook() {
        return new Book("The Iliad", "Homer");
    }
}
