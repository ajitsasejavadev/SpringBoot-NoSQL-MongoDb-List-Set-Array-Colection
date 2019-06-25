package com.app.document;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {
	
	@Id
	private String id;  //UUID
	
	private Integer bookId;
	private String bookCode;
	private String bookAuth;
	private Double bookCost;
	
	//collection type variable
	
	private List<String> codes;
	private String[] grades;
	
	public Book() {
		super();
	}

	public Book(Integer bookId, String bookCode, String bookAuth, Double bookCost, List<String> codes,
			String[] grades) {
		super();
		this.bookId = bookId;
		this.bookCode = bookCode;
		this.bookAuth = bookAuth;
		this.bookCost = bookCost;
		this.codes = codes;
		this.grades = grades;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookAuth() {
		return bookAuth;
	}

	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}

	public Double getBookCost() {
		return bookCost;
	}

	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}

	public List<String> getCodes() {
		return codes;
	}

	public void setCodes(List<String> codes) {
		this.codes = codes;
	}

	public String[] getGrades() {
		return grades;
	}

	public void setGrades(String[] grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookId=" + bookId + ", bookCode=" + bookCode + ", bookAuth=" + bookAuth
				+ ", bookCost=" + bookCost + ", codes=" + codes + ", grades=" + Arrays.toString(grades) + "]";
	}
	
}
