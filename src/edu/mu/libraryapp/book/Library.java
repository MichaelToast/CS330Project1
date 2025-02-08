package edu.mu.libraryapp.book;

public class Library {
	private Book[] bookList = new Book[5]; 
	private int numOfBooks;
	
	/**
	 * Constructor. Creates a Library that can hold up to 5 books
	 * */
	public Library() {
		this.numOfBooks = 0;
	} 
	
	/**
	 * Adds a book to the first available space in the library if its not full
	 * @param book - Book to be added to library
	 * @return false if not able to be added, true if book gets added
	 */
	public boolean addBook(Book book) {
		if (this.numOfBooks == bookList.length) {
			// The Library is full of books
			return false; 
		}
		// Need to search for first available opening
		for (int i = 0; i < bookList.length; i++) {
			if (bookList[i] == null) {
				bookList[i] = book;
				numOfBooks++;
				return true;
			}
		}
		// Not able to add/library is full
		return false; 
	}
	
	/**
	 * Removes book from library if it exists
	 * @param book - Book in library
	 * @return false if book not in library and returns true if it is
	 */
	public boolean removeBook(Book book) {
		if(book == null) {
			return false;
		}
		for(int i = 0; i < numOfBooks; i++) {
			if(bookList[i] != null && bookList[i].equals(book)) {
				// Found the book by the matching ISBN number
				for(int j = i; j < numOfBooks - 1; j++) {
					bookList[j] = bookList[j+1];
				}
				bookList[numOfBooks-1] = null;
				numOfBooks--;
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Searches for a book based off of the ISBN
	 * @param ISBN - Unique number to identify books
	 * @return book if it ISBN exists for one of book in library
	 */
	public Book searchByISBN(String ISBN) {
		for(int i = 0; i < numOfBooks; i++) {
			if(bookList[i] != null && (bookList[i].getISBN()).equals(ISBN)) {
				return bookList[i];
			}
		}
		return null;
	}
	
	/**
	 * Displays all of the books in the library
	 */
	public void displayBooks() {
		for(int i = 0; i < bookList.length; i++) {
			if(bookList[i] != null) {
				System.out.println(bookList[i]);
			}
		}
	}
}
