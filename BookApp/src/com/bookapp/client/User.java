package com.bookapp.client;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bookService = new BookServiceImpl(); 

		List<Book> list = bookService.getAllBooks();
		
		 for (Book book : list) {
			System.out.println(book);
		 }
		 
		 String author = "Chetan Bhagat";
		 
		 System.out.println( bookService.getAllAuthor(author));
		}
	}

