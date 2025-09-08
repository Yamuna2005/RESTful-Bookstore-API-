package com.yamuna.bookstoreapi.entity;

import jakarta.persistence.*;
@Entity
@Table(name="book")

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String title;
	private String isbn;
	private Double price;
	@Column(name = "publishedAt")
	private String publishedAt;
	
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;
	
	public Book() {}
		public Book(Long id,String title,String isbn,Double price,String publishedAt,Author author) {
			this.id = id;
			this.title = title;
			this.isbn = isbn;
			this.price = price;
			this.publishedAt = publishedAt;
			this.author = author;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		public String getPublishedAt() {
			return publishedAt;
		}
		public void setPublishedat(String publishedAt) {
			this.publishedAt = publishedAt;
		}
		public Author getAuthor() {
			return author;
		}
		public void setAuthor(Author author) {
			this.author = author;
		}
	
}