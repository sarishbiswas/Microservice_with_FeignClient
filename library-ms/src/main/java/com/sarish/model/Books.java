package com.sarish.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {

	private int bookId;
	private String bookName;
	private String bookAuthor;
	private String bookType;
	private int noOfBooks;
}
