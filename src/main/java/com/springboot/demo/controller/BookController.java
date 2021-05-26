package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.entity.Book;
import com.springboot.demo.service.BookService;


@RestController
public class BookController {
	
	@Autowired
	private BookService service;
	
	@PostMapping("/createBook")
	public Book createBook(@RequestBody Book book) {
		return service.saveBook(book);
	}
	
	@PostMapping("/createBooks")
	public List<Book> createBooks(@RequestBody List<Book> books){
		return service.saveBooks(books);
	}

	@GetMapping("/retrieveBooks")
	public List<Book> retrieveBooks() {
		return service.getAllBooks();
	}
	
	@GetMapping("/retrieveBookById/{id}")
	public Book retrieveBookById(@PathVariable int id) {
		return service.getBookById(id);
	}
	
	@GetMapping("/retrieveBooksByAuthor/{name}")
	public List<Book> retrieveBooksByAuthor(@PathVariable String name){
		return service.getBooksByAuthor(name);
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id) {
		return service.deleteBook(id);
	}
	
	@PutMapping("/updateBook")
	public Book updateBook(@RequestBody Book book) {
		return service.updateBook(book);
	}
	
}
