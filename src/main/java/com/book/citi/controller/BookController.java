package com.book.citi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.citi.entities.Book;
import com.book.citi.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getBooks() {
	
		System.out.println("welcome to rest api get method");
		return this.bookService.getAllBooks();
		
	}
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		System.out.println("welcome to single book method");
		return this.bookService.getBookById(id);
		
	}
	
	@PostMapping("/books")
	public Book addBooks(@RequestBody Book b) {
		System.out.println("adding book");
		return this.bookService.addBook(b);
	}
}
