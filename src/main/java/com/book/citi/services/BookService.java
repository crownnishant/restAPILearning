package com.book.citi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.book.citi.entities.Book;

@Component
public class BookService {
	
	private static List<Book> list=new ArrayList<>();
	
	static {
		
		list.add(new Book(24515, "Java complete ref", "Jugnu"));
		list.add(new Book(856998, "C leanring", "Himanshu"));
		list.add(new Book(24585, "Big python", "Rahul"));
		
	}
	
	//get all the books
	public List<Book> getAllBooks(){
		return list;
	}
	
	//get single book by id
	
	public Book getBookById(int id) {
		Book book=null;
		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}
	
	//add more book
	
	public Book addBook(Book b) {
		list.add(b);
		return b;
	}
}
