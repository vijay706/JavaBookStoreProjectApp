package com.mycompany.bookstore.testing;

import com.mycompany.bookstore.controller.Bookcontroller;
import com.mycompany.bookstore.dto.Bookdto;

public class BookClient {

	public static void main(String[] args) {
		System.out.println("This is client class for book");

		Bookcontroller controller = new Bookcontroller();
		//call the add book functionality
		addBook(controller);
		//call the get book detail functionality
		getBook(controller, 111L);
	}
	private static void getBook(Bookcontroller controller, Long bookId) {
		Bookdto bookdto = controller.getBook(bookId);
		System.out.println("following details for book with Id "+bookId);
		System.out.println("Book name "+ bookdto.getBookID());
		System.out.println("Author name "+bookdto.getAuthorName());
		System.out.println("price "+bookdto.getPricePerQty());
		System.out.println("Description "+bookdto.getDescription());
		System.out.println("Availability  "+bookdto.getAvalableQty());
		System.out.println("Authormail "+bookdto.getAuthorEmail());
	}
		
		private static void addBook(Bookcontroller controller) {
	//create a BookDto and call the controller add book method
	Bookdto bookdto = new Bookdto();
	bookdto.setBookID(111L);
	bookdto.setAuthorEmail("autho@gmail.com");
	bookdto.setAuthorName("vijay");
	bookdto.setAvalableQty(10);
	bookdto.setDescription("Comics");
	bookdto.setName("Bookone");
	bookdto.setPricePerQty(27.50);
	//call controller and add method to hold the return value
	Long BookId =controller.add(bookdto);
	if(BookId == null) {
		
		System.out.println("Book was succesfully created with Id: "+BookId);
	}
	else{
		System.out.println("some error created while creating a book");
	}

			
		}
			
		
		

}
