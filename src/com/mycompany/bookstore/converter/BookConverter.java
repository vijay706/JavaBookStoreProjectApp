package com.mycompany.bookstore.converter;

import com.mycompany.bookstore.dto.Bookdto;
import com.mycompany.bookstore.entity.BookEntity;

public class BookConverter {
  public static BookEntity convertBookDtotoBookEntity(Bookdto bookdto) {
	  BookEntity be = new BookEntity();
		  be.setAuthorEmail(bookdto.getAuthorEmail());
		  be.setAuthorName(bookdto.getAuthorName());
		  be.setAvalableQty(bookdto.getAvalableQty());
		  be.setBookID(bookdto.getBookID());
		  be.setDescription(bookdto.getDescription());
		  be.setName(bookdto.getName());
		  be.setPricePerQty(bookdto.getPricePerQty());
		  
		  return be;
		  
    
	  
  }
  public static Bookdto convertBookEntitytoBookDto(BookEntity bookEntity) {
	  Bookdto bookdto = new Bookdto();
	  bookdto .setAuthorEmail(bookEntity.getAuthorEmail());
	  bookdto .setAuthorName(bookEntity.getAuthorName());
	  bookdto .setAvalableQty(bookEntity.getAvalableQty());
	  bookdto .setBookID(bookEntity.getBookID());
	  bookdto .setDescription(bookEntity.getDescription());
	  bookdto .setName(bookEntity.getName());
	  bookdto .setPricePerQty(bookEntity.getPricePerQty());
		  
		  return  bookdto ;
		  
    
	  
  }
}
