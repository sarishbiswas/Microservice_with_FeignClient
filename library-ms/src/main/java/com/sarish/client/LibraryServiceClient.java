package com.sarish.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sarish.model.Books;

@FeignClient(name = "book-service", url = "http://localhost:8081/bs")
public interface LibraryServiceClient {
	@GetMapping("/getallbooks")
	public List<Books> getAll();
	@GetMapping("/getbook/{type}")
	public List<Books> getBookByType( @PathVariable("type") String type);
}
