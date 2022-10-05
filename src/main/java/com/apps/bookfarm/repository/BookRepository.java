package com.apps.bookfarm.repository;

import com.apps.bookfarm.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long>{

    List<Book> findByIsbn(int isbn);
}
