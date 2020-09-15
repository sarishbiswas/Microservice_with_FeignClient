package com.sarish.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarish.model.Books;
import com.sarish.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository repository;
	
	public List<Books> getAllBooks() {
		return repository.findAll();
	}
	public Optional<Books> getBookByBookId(int id) {
		return repository.findById(id);
	}
	public List<Books> getBookByType(String type){
		return repository.findByBookType(type);
	}
}
