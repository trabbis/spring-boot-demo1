package com.example.persistence.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.example.persistence.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
