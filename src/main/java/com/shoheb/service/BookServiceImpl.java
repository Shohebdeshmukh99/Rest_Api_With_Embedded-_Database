package com.shoheb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoheb.entity.Book;
import com.shoheb.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository repository;
	
	@Override
	public String upsertBook(Book book) {
		repository.save(book);
		if(book.getBookId()==null) {
			return "record inserted";
		}
		else {
			return "record updated";
		}
	}

	@Override
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);
		return "record deleted";
	}

}
