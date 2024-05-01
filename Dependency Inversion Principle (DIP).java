/*
 * Program Title: A JAVA program demonstrating Dependency Inversion Principle (DIP) of SOLID.
 * Author: Md. Habibur Rahman, CSEKU.

 DIP: High-level modules should not depend on low-level modules. Both should depend on abstractions. 
 Abstractions should not depend on details. Details should depend on abstractions.
 
 */

/**
 * Represents a book with title, author, and year of publication.
 */
class Book {
    private String title; // Title of the book
    private String author; // Author of the book
    private int yearPublished; // Year of publication of the book

    /**
     * Constructs a Book object with the specified title, author, and year of publication.
     * @param title The title of the book.
     * @param author The author of the book.
     * @param yearPublished The year of publication of the book.
     */
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    /**
     * Retrieves the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     * @param title The title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the author of the book.
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     * @param author The author of the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Retrieves the year of publication of the book.
     * @return The year of publication of the book.
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Sets the year of publication of the book.
     * @param yearPublished The year of publication of the book.
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}

/**
 * Represents a service for managing a library.
 */
interface LibraryService {
    /**
     * Adds a book to the library.
     * @param book The book to be added.
     */
    void addBook(Book book);
    
    /**
     * Removes a book from the library.
     * @param book The book to be removed.
     */
    void removeBook(Book book);
}

/**
 * Represents a library service implementation using a database.
 */
class DatabaseLibraryService implements LibraryService {
    /**
     * Adds a book to the library (implementation using a database).
     * @param book The book to be added.
     */
    @Override
    public void addBook(Book book) {
        // Code to add book to database
        System.out.println("Book added to database: " + book.getTitle());
    }

    /**
     * Removes a book from the library (implementation using a database).
     * @param book The book to be removed.
     */
    @Override
    public void removeBook(Book book) {
        // Code to remove book from database
        System.out.println("Book removed from database: " + book.getTitle());
    }
}

/**
 * Represents a library service implementation using an in-memory repository.
 */
class InMemoryLibraryService implements LibraryService {
    private List<Book> books = new ArrayList<>(); // List to store books in memory

    /**
     * Adds a book to the library (implementation using an in-memory repository).
     * @param book The book to be added.
     */
    @Override
    public void addBook(Book book) {
        books.add(book); // Add book to in-memory repository
    }

    /**
     * Removes a book from the library (implementation using an in-memory repository).
     * @param book The book to be removed.
     */
    @Override
    public void removeBook(Book book) {
        books.remove(book); // Remove book from in-memory repository
    }
}

/**
 * Represents a manager for a library.
 */
class LibraryManager {
    private LibraryService libraryService; // Dependency on LibraryService abstraction

    /**
     * Constructs a LibraryManager with the specified LibraryService implementation.
     * @param libraryService The LibraryService implementation to be used.
     */
    public LibraryManager(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    /**
     * Adds a book to the library using the LibraryService implementation.
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        libraryService.addBook(book); // Delegate book addition to LibraryService implementation
    }

    /**
     * Removes a book from the library using the LibraryService implementation.
     * @param book The book to be removed.
     */
    public void removeBook(Book book) {
        libraryService.removeBook(book); // Delegate book removal to LibraryService implementation
    }
}
