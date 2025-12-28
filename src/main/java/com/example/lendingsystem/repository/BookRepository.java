// Developed Repository interfaces for database operations - jiro theo vacunawa
package com.example.lendingsystem.repository;

import com.example.lendingsystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
