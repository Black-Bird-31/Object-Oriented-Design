
/*
 * Program Title: A JAVA program demonstrating Dependency Inversion Principle of SOLID.
 * Author: Md. Habibur Rahman, CSEKU.
 */


import java.util.ArrayList;
import java.util.List;

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

// Interface for LibraryService
interface LibraryService {
    void addBook(Book book);
    void removeBook(Book book);
}

// LibraryService implementation using a database
class DatabaseLibraryService implements LibraryService {
    @Override
    public void addBook(Book book) {
        // Code to add book to database
        System.out.println("Book added to database: " + book.getTitle());
    }

    @Override
    public void removeBook(Book book) {
        // Code to remove book from database
        System.out.println("Book removed from database: " + book.getTitle());
    }
}

// LibraryService implementation using an in-memory repository
class InMemoryLibraryService implements LibraryService {
    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }
}

// LibraryManager class that depends on LibraryService abstraction
class LibraryManager {
    private LibraryService libraryService;

    public LibraryManager(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    // Method to add a book using LibraryService
    public void addBook(Book book) {
        libraryService.addBook(book);
    }

    // Method to remove a book using LibraryService
    public void removeBook(Book book) {
        libraryService.removeBook(book);
    }
}
