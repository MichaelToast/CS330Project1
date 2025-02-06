package edu.mu.libraryapp.book;

import edu.mu.libraryapp.book.LibraryBook;

public class Library {
	// NOTE: We might have to have the 5 be added in the constructors
	private LibraryBook[] bookList; 
	private int numOfBooks;
	
	/*
	 * Constructor. Creates a Library that can hold up to 5 books
	 * */
	public Library() {
		this.bookList = new LibraryBook[5];
		// NOTE: We might have to check that all of the books are create in a good state
		this.numOfBooks = 0;
	} 
	
	public boolean addBook(LibraryBook book) {
		if (this.numOfBooks == bookList.length) {
			// The Library is full of books
			return false; 
		}
		// Need to search for first avalible opening
		for (int i = 0; i < 5; i ++) {
			if ()
		}
		
		
		numOfBooks ++;
		return true; 
	}
	
	public boolean removeBook(LibraryBook book) {
		// ADD IMPLEMENTATION
		return false;
	}
	
	public LibraryBook searchByISBN(String ISBN) {
		// ADD IMPLEMENTATION
	}
	
	public void displayBooks() {
		// ADD IMPLEMENTATION
	}
	
	
		
	
	
	
}
