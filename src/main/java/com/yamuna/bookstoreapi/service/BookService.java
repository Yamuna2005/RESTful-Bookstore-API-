package com.yamuna.bookstoreapi.service;
import com.yamuna.bookstoreapi.entity.Book;
import com.yamuna.bookstoreapi.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class BookService {
	private final BookRepository bookRepository;
	
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
		
	}
	public Book getBookById(Long id) {
		Optional<Book> book = bookRepository.findById(id);
				return book.orElse(null);
	}
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}
	public Book updateBook(Long id,Book updatedBook) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			Book book = optionalBook.get();
			book.setTitle(updatedBook.getTitle());
			book.setIsbn(updatedBook.getIsbn());
			book.setPrice(updatedBook.getPrice());
			book.setAuthor(updatedBook.getAuthor());
			return bookRepository.save(book);
		}
		return null;
	}
	
	public boolean deleteBook(Long id) {
		if(bookRepository.existsById(id)) {
			bookRepository.deleteById(id);
			return true;
			
		}
		return false;
	}
	
	

}
