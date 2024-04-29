package com.shoheb.service;

import java.util.List;

import com.shoheb.entity.Book;

public interface BookService {
	
	
	// save + update
	public String upsertBook(Book book);
	
	public List<Book> getAllBooks();
	
	//public String updateBook(Book book);
	
	public String deleteBook(Integer bookId);
	

}
