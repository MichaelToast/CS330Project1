package homework.libraryapp.library;

import homework.libraryapp.book.Book;

public class Library {
	// NOTE: We might have to have the 5 be added in the constructors
	private Book[] bookList; 
	private int numOfBooks;
	
	/**
	 * Constructor. Creates a Library that can hold up to 5 books
	 * */
	public Library() {
		this.bookList = new Book[5];
		// NOTE: We might have to check that all of the books are create in a good state
		this.numOfBooks = 0;
	} 
	
	public boolean addBook(Book book) {
		if (this.numOfBooks == bookList.length) {
			// The Library is full of books
			return false; 
		}
		// Need to search for first available opening
		for (int i = 0; i < 5; i ++) {
			if (bookList[i].getISBN() == "Unknown") {
				bookList[i] = book;
			}
		}
		
		
		numOfBooks++;
		return true; 
	}
	
	public boolean removeBook(Book book) {
		// ADD IMPLEMENTATION
		return false;
	}
	
	public Book searchByISBN(String ISBN) {
		// ADD IMPLEMENTATION
		Book bb = new Book();
		return bb;
	}
	
	public void displayBooks() {
		// ADD IMPLEMENTATION
	}
	
	
		
	
	
	
}