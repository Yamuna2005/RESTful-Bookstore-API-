package com.yamuna.bookstoreapi.service;
import com.yamuna.bookstoreapi.entity.Author;
import com.yamuna.bookstoreapi.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
	private final AuthorRepository authorRepository;
	
	public AuthorService(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	public List<Author> getAllAuthors(){
		return authorRepository.findAll();
	}
	public Optional<Author> getAuthorById(Long id){
		return authorRepository.findById(id);
	}
	public Author createAuthor(Author author) {
		return authorRepository.save(author);
	}
	public Author updateAuthor(Long id,Author updatedAuthor) {
		return authorRepository.findById(id).map(author ->{
			author.setName(updatedAuthor.getName());
			return authorRepository.save(author);
		}).orElse(null);
	}
	public void deleteAuthor(Long id) {
		authorRepository.deleteById(id);
	}

}
