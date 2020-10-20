package com.bookapp.dao;

import java.util.List;

import com.bookapp.model.Book;

public interface BookDAO {
	List <Book> getAllBooks();
	List <Book> getAllAuthor(String author);
	List <Book> getAllCategory(String category);
	Book getById(int id);
}
