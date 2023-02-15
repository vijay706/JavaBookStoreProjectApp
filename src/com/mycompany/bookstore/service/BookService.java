package com.mycompany.bookstore.service;

import com.mycompany.bookstore.dto.Bookdto;

public interface BookService {
	public Long add(Bookdto bookdto);
	public Bookdto getBook(Long bookId);

}
