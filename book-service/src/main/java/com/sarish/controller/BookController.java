package com.sarish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarish.model.Books;
import com.sarish.service.BookService;

@RestController
@RequestMapping("/bs")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/getallbooks")
	public List<Books> getAll(){
		return bookService.getAllBooks();
	}
	@GetMapping("/getbook/{type}")
	public List<Books> getBookByType( @PathVariable("type") String type){
		return bookService.getBookByType(type);
	}
	@GetMapping("/getbyid/{bookId}")
	public Books getBookById(@PathVariable("bookId") int bookId) {
		return bookService.getBookByBookId(bookId).orElseThrow(()->new IllegalArgumentException("Id is not valid"));
	}
}
