package com.mycompany.bookstore.serviceimpl;

import com.mycompany.bookstore.converter.BookConverter;
import com.mycompany.bookstore.dto.Bookdto;
import com.mycompany.bookstore.entity.BookEntity;
import com.mycompany.bookstore.repository.BookRepository;
import com.mycompany.bookstore.repositoryimpl.BookRepositoryImpl;
import com.mycompany.bookstore.service.BookService;

public class BookServiceImpl implements BookService {
	private BookRepository bookRepository;
	public BookServiceImpl() {
		this.bookRepository = new BookRepositoryImpl();
	}

	@Override
	public Long add(Bookdto bookdto) {
		//convert Dto to repository compatible Entity class
		//Adaptive design pattern
		BookEntity bookEntity = BookConverter.convertBookDtotoBookEntity(bookdto);
		return this.bookRepository.add(bookEntity);
	}

	@Override
	public Bookdto getBook(Long bookId) {
		//convert Entity to service compatible DTO class
				//Adaptive design pattern
		 BookEntity bookEntity = this.bookRepository.getDetail(bookId);
		Bookdto bookdto = BookConverter.convertBookEntitytoBookDto(bookEntity);
		return bookdto;
	}

}
