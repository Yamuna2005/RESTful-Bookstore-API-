package com.yamuna.bookstoreapi.controller;

import com.yamuna.bookstoreapi.entity.Book;
import com.yamuna.bookstoreapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/books")

public class BookController {
	
	@Autowired
	private BookRepository repo;
	
	//Get all books
	@GetMapping
	public List<Book> getAll(){
		return repo.findAll();
	}
	//Add a book
	@PostMapping
	public Book createBook(@RequestBody Book book) {
		return repo.save(book);
	}
	//Get book by id
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable Long id) {
		return repo.findById(id).orElse(null);
		}
	//Update book
	@PutMapping("/{id}")
	public Book update(@PathVariable Long id, @RequestBody Book b) {
		return repo.findById(id).map(book ->{
					book.setTitle(b.getTitle());
					book.setIsbn(b.getIsbn());
					book.setAuthor(b.getAuthor());
				return repo.save(book);
				}).orElse(null);
	
	}
	//Delete book
	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		repo.deleteById(id);
		return "Book deleted";
		}

}
