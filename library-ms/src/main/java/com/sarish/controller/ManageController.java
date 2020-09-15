package com.sarish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarish.model.Books;
import com.sarish.service.LibraryService;

@RestController
@RequestMapping("/lms")
public class ManageController {
	@Autowired
	private LibraryService service;
	@GetMapping("/getall")
	public List<Books> getAllBooks(){
		return service.getAllBooks();
	}
	@GetMapping("/getbytype/{type}")
	public List<Books> getByType(@PathVariable("type") String type){
		return service.getBooksByType(type);
	}
}
