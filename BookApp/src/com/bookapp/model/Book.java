package com.bookapp.model;

public class Book {
	
	
	Integer bookId;
	String name;
	String author;
	String category;
	Double price;
	
	
	public Integer getBookId() {
		return bookId;
	}


	public Book(Integer bookId, String name, String author, String category, Double price) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}

}
