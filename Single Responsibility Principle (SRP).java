/*
 * Program Title: A JAVA program demonstrating Single Responsibility Prinicple (SRP) of SOLID.
 * Author: Md. Habibur Rahman, CSEKU.
 */

import java.util.*;

// Book class with getter and setter methods
class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
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

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}

// BookManager class with methods to add or remove books
class BookManager {
    private List<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed: " + book.getTitle());
        } else {
            System.out.println("Book not found: " + book.getTitle());
        }
    }

    public void listBooks() {
        System.out.println("Books in library:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYearPublished() + ")");
        }
    }
}

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
