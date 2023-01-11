package de.uni.koeln.de.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.uni.koeln.de.bookstore.datamodel.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {
    
}
