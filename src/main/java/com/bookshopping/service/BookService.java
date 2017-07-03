package com.bookshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshopping.model.Book;
import com.bookshopping.repository.BookRepository;


@Service
public class BookService {
	@Autowired
	private BookRepository bookrepository;
	public List<Book> findAll(){
		return bookrepository.findAll();
	}
	public Book findOne(int id) {
		return bookrepository.findOne(id);
	}
	

	

}
