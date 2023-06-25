package com.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.bookclub.models.Book;
import com.bookclub.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepo;
	
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}
	
	public Book register(Book book, BindingResult result) {
		if(result.hasErrors()) {
			return null;
		}
		return bookRepo.save(book);
	}
	
	public Book getOneBook(Long id) {
		Optional<Book> book = bookRepo.findById(id);
		if(book.isPresent()) {
			return book.get();
		}
		else {
			return null;
		}
	}
	
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
	
	public Book editBook(Book book) {
		return bookRepo.save(book);
	}
	

}
