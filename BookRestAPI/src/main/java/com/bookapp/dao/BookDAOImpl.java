package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bookapp.model.Book;

@Service
public class BookDAOImpl implements BookDAO {

	public BookDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return showBookList();
	}

	@Override
	public List<Book> getAllAuthor(String author) {
		List<Book> newBookList = new ArrayList<>();
		// TODO Auto-generated method stub
		for(Book book : showBookList()) {
			if(book.getAuthor().equals(author))
				newBookList.add(book);
		}return newBookList;
	}

	@Override
	public List<Book> getAllCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> newBookList = new ArrayList<>();
		for(Book book : showBookList()) {
			if(book.getCategory().equals(category)) {
				newBookList.add(book);
			}
		}
		return newBookList;
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		for(Book book : showBookList()) {
			if(book.getBookId()==id)
				return book;
	}return null;
}
	
	private List<Book> showBookList()
	{
		return Arrays.asList(
				new Book(1,"2 states","Chetan Bhagat","a", 450.00),
				new Book(2,"Secret","Rhonda","a",350.00),
				new Book(3,"Shiv trilogogy","Shiv","b",250.00),
				new Book(4,"Shelby","JK Rowling","c",150.00)
				
				);
	}

}
