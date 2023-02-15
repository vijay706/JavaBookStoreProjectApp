package com.mycompany.bookstore.entity;

import java.io.Serializable;

public class BookEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2084154479841731114L;
	private Long bookID;
	private String name;
	private String description;
	private Double pricePerQty;
	private Integer avalableQty;
	private String authorName;
	private String authorEmail;
	
	public BookEntity() {}
	public Long getBookID() {
		return bookID;
	}
	public void setBookID(Long bookID) {
		this.bookID = bookID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPricePerQty() {
		return pricePerQty;
	}
	public void setPricePerQty(Double pricePerQty) {
		this.pricePerQty = pricePerQty;
	}
	public Integer getAvalableQty() {
		return avalableQty;
	}
	public void setAvalableQty(Integer avalableQty) {
		this.avalableQty = avalableQty;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	
	
	
	
	
	

}
