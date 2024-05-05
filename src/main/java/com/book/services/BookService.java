package com.book.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.model.Book;
import com.book.reporisity.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookrepo;

    public Book createBook(Book book) throws Exception {
        return bookrepo.save(book);
    }

    public List<Book> allBook() throws Exception {
        return (List<Book>) bookrepo.findAll();
    }

    public void editBook(String id, Book updatedBook) throws Exception {
        Book existingBook = bookrepo.findById(id).orElse(null);
        if (existingBook != null) {
            existingBook.setName(updatedBook.getName());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setPrice(updatedBook.getPrice());
            existingBook.setGenres(updatedBook.getGenres());
            bookrepo.save(existingBook);
        }
    }
}
