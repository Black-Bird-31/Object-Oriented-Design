/*
 * Program Title: A JAVA program demonstrating Single Responsibility Principle (SRP) of SOLID.
 * Author: Md. Habibur Rahman, CSEKU.

 
 SRP: The Single Responsibility Principle (SRP) states that a class should have only one reason to change, 
 meaning it should have only one responsibility. 
 
 */

import java.util.*;

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
// The Book class is responsible for representing the attributes of a book (title, author, and yearPublished).


// BookManager class with methods to add or remove books
class BookManager {
    private List<Book> books; // List to store books in the library

    // Constructor to initialize BookManager with an empty list of books
    public BookManager() {
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Method to remove a book from the library
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed: " + book.getTitle());
        } else {
            System.out.println("Book not found: " + book.getTitle());
        }
    }

    // Method to list all books in the library
    public void listBooks() {
        System.out.println("Books in library:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYearPublished() + ")");
        }
    }
}
    // The BookManager class is responsible for managing books in the library. It provides methods for adding, removing, and listing books.

public class BookLibraryExample {
    public static void main(String[] args) {
        // Create BookManager instance
        BookManager manager = new BookManager();

        // Create some books
        Book book1 = new Book("Java Programming", "John Smith", 2020);
        Book book2 = new Book("Python Basics", "Emily Brown", 2019);

        // Add books to the library
        manager.addBook(book1);
        manager.addBook(book2);

        // List all books in the library
        manager.listBooks();

        // Remove a book
        manager.removeBook(book2);

        // List all books again
        manager.listBooks();
    }
}

//The BookLibraryExample class is responsible for demonstrating the functionality of the Book and BookManager classes.


