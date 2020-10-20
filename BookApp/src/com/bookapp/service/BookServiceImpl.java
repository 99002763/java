package com.bookapp.service;

import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.dao.*;
public class BookServiceImpl implements BookService{
   BookDAO bookDAO = new BookDAOImpl();
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDAO.getAllBooks();
	}

	@Override
	public List<Book> getAllAuthor(String author) {
		// TODO Auto-generated method stub
		return bookDAO.getAllAuthor(author);
	}

	@Override
	public List<Book> getAllCategory(String category) {
		// TODO Auto-generated method stub
		return bookDAO.getAllCategory(category);
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		return bookDAO.getById(id);
	}

	

}
