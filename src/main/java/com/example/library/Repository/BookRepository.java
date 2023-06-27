package com.example.library.Repository;

import com.example.library.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitleContainingOrDescriptionContaining(String keyword1, String keyword2);

}
