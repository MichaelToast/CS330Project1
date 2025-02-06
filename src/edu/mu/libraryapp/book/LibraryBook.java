package edu.mu.libraryapp.book;

public class LibraryBook {
	private String title;
	private String author;
	private String ISBN;
	private double price; 
	
	/**
	 * Added a Default constructor "LibraryBook" that initializes title, author, and ISBN to "Unknown" and price to 0.0
  	*/
	public LibraryBook() 
	{
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
		
		
	/**
	* Created a parameterized constructor that allows the user to set custom values
	* to the parameters.
	* @param title - The title of the book.
	* @param author - The author of the book.
	* @param ISBN - The ISBN number of the book.
	* @param price - The price of the book.
	*/
	public LibraryBook(String title, String author, String ISBN, double price) 
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	
}
