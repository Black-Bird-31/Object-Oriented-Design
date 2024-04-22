/*
 * Program Title: A JAVA program demonstrating Dependency Inversion Principle of SOLID.
 * Author: Md. Habibur Rahman, CSEKU.
 */

import java.util.ArrayList;
import java.util.List;

// Book class with getter and setter methods
class Book {
    private String title; // Title of the book
    private String author; // Author of the book
    private int yearPublished; // Year of publication of the book

    // Constructor to initialize a Book object with title, author, and yearPublished
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getter method for the title of the book
    public String getTitle() {
        return title;
    }

    // Setter method for the title of the book
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method for the author of the book
    public String getAuthor() {
        return author;
    }

    // Setter method for the author of the book
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for the year of publication of the book
    public int getYearPublished() {
        return yearPublished;
    }

    // Setter method for the year of publication of the book
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}

// Interface for LibraryService
interface LibraryService {
    // Method to add a book to the library
    void addBook(Book book);
    
    // Method to remove a book from the library
    void removeBook(Book book);
}

// LibraryService implementation using a database
class DatabaseLibraryService implements LibraryService {
    // Method to add a book to the library (implementation using a database)
    @Override
    public void addBook(Book book) {
        // Code to add book to database
        System.out.println("Book added to database: " + book.getTitle());
    }

    // Method to remove a book from the library (implementation using a database)
    @Override
    public void removeBook(Book book) {
        // Code to remove book from database
        System.out.println("Book removed from database: " + book.getTitle());
    }
}

// LibraryService implementation using an in-memory repository
class InMemoryLibraryService implements LibraryService {
    private List<Book> books = new ArrayList<>(); // List to store books in memory

    // Method to add a book to the library (implementation using an in-memory repository)
    @Override
    public void addBook(Book book) {
        books.add(book); // Add book to in-memory repository
    }

    // Method to remove a book from the library (implementation using an in-memory repository)
    @Override
    public void removeBook(Book book) {
        books.remove(book); // Remove book from in-memory repository
    }
}

// LibraryManager class that depends on LibraryService abstraction
class LibraryManager {
    private LibraryService libraryService; // Dependency on LibraryService abstraction

    // Constructor to initialize LibraryManager with a LibraryService implementation
    public LibraryManager(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    // Method to add a book using LibraryService
    public void addBook(Book book) {
        libraryService.addBook(book); // Delegate book addition to LibraryService implementation
    }

    // Method to remove a book using LibraryService
    public void removeBook(Book book) {
        libraryService.removeBook(book); // Delegate book removal to LibraryService implementation
    }
}
