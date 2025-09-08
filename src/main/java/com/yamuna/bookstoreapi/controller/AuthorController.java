package com.yamuna.bookstoreapi.controller;
import com.yamuna.bookstoreapi.entity.Author;
import com.yamuna.bookstoreapi.service.AuthorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/authors")

public class AuthorController {
	
	private final AuthorService authorService;
	public AuthorController(AuthorService authorService) {
		this.authorService = authorService;
		
	}
	@GetMapping
	public List<Author>getAllAuthors(){
		return
				authorService.getAllAuthors();
	}
	
	@GetMapping("/{id}")
	public Optional<Author>getAuthorById(@PathVariable Long id){
		return authorService.getAuthorById(id);
		
	}
	@PostMapping
	public Author createAuthor(@RequestBody Author author) {																																																																	
		return
				authorService.createAuthor(author);
		
	}
	@PutMapping("/{id}")
	public Author updateAuthor(@PathVariable Long id,@RequestBody Author updatedAuthor) {
		return
				authorService.updateAuthor(id,updatedAuthor);
	}
	@DeleteMapping
	public void deleteAuthor(@PathVariable Long id) {
		authorService.deleteAuthor(id);
	}
	

}
