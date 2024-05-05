package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.Book;
import com.book.services.BookService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/api/data/v1")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String book() {
        return "Hell World";
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public void createBook(@RequestBody Book book) {
        bookService.createBook(book);
        log.info("Book Add");
    }

    @RequestMapping(value = "/getBook", method = RequestMethod.GET)
    public List<Book> getBook() {
        return bookService.allBook();
    }

    @RequestMapping(value = "/updateBook/{id}", method = RequestMethod.PUT)
    public String updateBook(@PathVariable(value = "id") String id, @RequestBody Book book) {
        bookService.editBook(id, book);
        return "Update Successfully!";
    }

}
