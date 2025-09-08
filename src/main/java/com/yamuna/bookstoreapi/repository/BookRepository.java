package com.yamuna.bookstoreapi.repository;
import com.yamuna.bookstoreapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface  BookRepository extends JpaRepository<Book, Long> {

}
