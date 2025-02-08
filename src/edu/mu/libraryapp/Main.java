package edu.mu.libraryapp;

import edu.mu.libraryapp.book.Book;
import edu.mu.libraryapp.book.Library

public class Main {
    public static void main(String[] args) {
        // Create Library object
        Library library = new Library();
        System.out.println("Library created.\n");

        //  Add 3 books to the library
        Book bookOne = new Book("Clean Code", "Robert C. Martin", "978-0135166307", 40.99);
        Book bookTwo = new Book("Design Patterns", "Erich Gamma", "978-0201633610", 50.99);
        Book bookThree = new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059", 45.99);

        System.out.println("Adding books...");
        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookThree);
        System.out.println("Books added successfully.\n");

        // Search for a book by ISBN
        String searchISBN = "978-0135166307";
        System.out.println("Searching for book with ISBN: " + searchISBN);
        Book foundBook = library.searchByISBN(searchISBN);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
        System.out.println();

        // Display all books in the library
        System.out.println("All books in the library:");
        library.displayBooks();
        System.out.println();

        // Remove a book that exists in library
        System.out.println("Removing book: " + bookTwo);
        boolean removedBook = library.removeBook(bookTwo);
        if (removedBook) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book could not be removed.");
        }
        System.out.println();

        // Display all books after removal
        System.out.println("All books in the library:");
        library.displayBooks();
        System.out.println();

        // Try to remove a non-existent book and system can't
        Book noBook = new Book("Not A Book", "Not an Author", "000-0000000000", 0.0);
        boolean removedNonExistent = library.removeBook(noBook);
        if (removedNonExistent) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Cannot remove book: " + noBook + " as it doesn't exist.");
        }
        System.out.println();
    }
}

