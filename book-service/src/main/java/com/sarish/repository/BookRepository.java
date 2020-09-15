package com.sarish.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sarish.model.Books;
@Repository
public interface BookRepository extends JpaRepository<Books, Integer>{
	public List<Books> findByBookType(String bookType);
}
