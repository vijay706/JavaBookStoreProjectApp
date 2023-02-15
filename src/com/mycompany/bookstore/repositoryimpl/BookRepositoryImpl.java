package com.mycompany.bookstore.repositoryimpl;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.bookstore.entity.BookEntity;
import com.mycompany.bookstore.repository.BookRepository;
import com.mycompany.bookstore.senduser.BookSerializer;

public class BookRepositoryImpl implements BookRepository {
	

	@Override
	public Long add(BookEntity bookEntity) {
		
	BookSerializer.serializeBook(bookEntity);
		return bookEntity.getBookID();
	}

	@Override
	public BookEntity getDetail(Long bookId) {
	BookEntity be =	BookSerializer.deserializeBook(bookId);
		return be;
	}

}
