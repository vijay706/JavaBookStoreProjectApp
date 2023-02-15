package com.mycompany.bookstore.controller;

import com.mycompany.bookstore.dto.Bookdto;
import com.mycompany.bookstore.service.BookService;
import com.mycompany.bookstore.serviceimpl.BookServiceImpl;

public class Bookcontroller {
	private BookService bookService;
	public Bookcontroller() {
		//dynamic runtime polymophorism
		this.bookService = new BookServiceImpl();
	}
	public Long add(Bookdto bookdto) {
		// TODO Auto-generated method stub
		return this.bookService.add(bookdto);
		
	} 
public Bookdto getBook(Long bookId) {
	//call the service layer and get the bookdto object
	return this.bookService.getBook(bookId);

}
}
