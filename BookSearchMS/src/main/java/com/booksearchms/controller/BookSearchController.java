package com.booksearchms.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookSearchController {
	
	Logger logger = LoggerFactory.getLogger(BookSearchController.class);
	
	@GetMapping("/allbooks")
	public List<String> getAllBooks(){
		logger.info("BookSearchController -- getAllBooks()");
		
		List<String> booksList = new ArrayList<String>();
		booksList.add("SpringBoot");
		booksList.add("Angular");
		booksList.add("ReactJS");
		booksList.add("NodeJS");
		booksList.add("MongoDB");
		return booksList;
	}
}
