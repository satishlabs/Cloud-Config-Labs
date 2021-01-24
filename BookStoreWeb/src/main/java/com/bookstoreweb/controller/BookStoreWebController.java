package com.bookstoreweb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstoreweb.proxy.BookSearchProxy;

@RestController
public class BookStoreWebController {
	
	Logger logger = LoggerFactory.getLogger(BookStoreWebController.class);
	
	@Autowired
	private BookSearchProxy bookSearchProxy;
	
	@GetMapping("/mybooks")
	public List<String> getMyBooks(){
		logger.info("BookStoreWebController --getMyBooks()");
		List<String> booksList = bookSearchProxy.getAllBooks();
		return booksList;
	}
}
