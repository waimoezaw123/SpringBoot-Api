package com.book.reporisity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.book.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}
