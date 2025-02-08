package edu.mu.libraryapp.book;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price; 
	
	/**
	 * Added a Default constructor "LibraryBook" that initializes title, author, and ISBN to "Unknown" and price to 0.0
  	*/
	public Book() 
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
	public Book(String title, String author, String ISBN, double price) 
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	/**
	 * This is a copy constructor. Giving the details of the argument book to the newly created book
	 * @param book - The book you want to copy the information to. 
	 * */
	public Book(Book book) {
	    this(book.title, book.author, book.ISBN, book.price);
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
	    return (title + " by " + author + " (ISBN: " + ISBN + ", $" + price + ")");
	}

	/**
	 * Returns true if the argument book shares the same ISBN number
	 * @param - Book to compare to
	 * */
	@Override
	public boolean equals(Object obj) {
	    if (!(obj instanceof Book)) {
	        return false;
	    }
	    Book otherBook = (Book) obj;
	    return this.ISBN.equals(otherBook.ISBN);
	}
}
