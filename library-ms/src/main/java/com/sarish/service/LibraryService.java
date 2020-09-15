package com.sarish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarish.client.LibraryServiceClient;
import com.sarish.model.Books;
import com.sarish.repository.ManagementRepository;

@Service
public class LibraryService {
	@Autowired
	private LibraryServiceClient client;
	@Autowired
	private ManagementRepository repository;
	
	public List<Books> getAllBooks(){
		return client.getAll();
	}
	public List<Books> getBooksByType(String type){
		return client.getBookByType(type);
	}
}
