package com.bookshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookshopping.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book , Integer>{

	
}
