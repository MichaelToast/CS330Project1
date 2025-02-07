package edu.mu.libraryapp;

import edu.mu.libraryapp.book.LibraryBook;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		LibraryBook book1 = new LibraryBook();
		LibraryBook book2 = new LibraryBook("Pain", "Me", "123456789", 20.0);
		//String title, String author, String ISBN, double price
		
		System.out.println("OUR FIRST BOOK: " + book1);
		book1.setTitle("1984");
		book1.setPrice(420.0);
		book1.setISBN("1443434973");
		book1.setAuthor("George Orwel");
		System.out.println("OUR FIRST BOOK: " + book1);
		System.out.println("OUR SECOND BOOK: " + book2);
		
		if (book1.equals(book2)) {
			System.out.println("OH NO");
		}
		else {
			System.out.println("OH YEAH");
		}

		if (book1.equals(book1)) {
			System.out.println("OH NO");
		}
		else {
			System.out.println("OH YEAH");
		}
		
	}

}
