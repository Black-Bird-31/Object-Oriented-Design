/*
 * Program Title: A JAVA program demonstrating Open Closed Principle of SOLID.
 * Author: Md. Habibur Rahman, CSEKU.
 
 OCP: The Open-Closed Principle (OCP) states that software entities should be open for extension but closed for modification. 
 
 */


import java.util.*;

/**
 * Book class representing a book with title, author, and year of publication.
 */
class Book {
    private String title; // Title of the book
    private String author; // Author of the book
    private int yearPublished; // Year of publication of the book

    /**
     * Constructor to initialize a Book object with title, author, and year of publication.
     * 
     * @param title         The title of the book.
     * @param author        The author of the book.
     * @param yearPublished The year of publication of the book.
     */
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    /**
     * Getter method for the title of the book.
     * 
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter method for the author of the book.
     * 
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Getter method for the year of publication of the book.
     * 
     * @return The year of publication of the book.
     */
    public int getYearPublished() {
        return yearPublished;
    }
}

/**
 * Interface for defining a book filter.
 */
interface BookFilter {
    /**
     * Method to apply a filter to a book.
     * 
     * @param book The book to apply the filter to.
     * @return True if the book passes the filter, false otherwise.
     */
    boolean apply(Book book);
}

/**
 * BookFilter implementation to filter books by author.
 */
class AuthorFilter implements BookFilter {
    private String author; // Author to filter by

    /**
     * Constructor to initialize AuthorFilter with an author.
     * 
     * @param author The author to filter by.
     */
    public AuthorFilter(String author) {
        this.author = author;
    }

    /**
     * Method to apply the author filter to a book.
     * 
     * @param book The book to apply the filter to.
     * @return True if the book's author matches the filter, false otherwise.
     */
    @Override
    public boolean apply(Book book) {
        return book.getAuthor().equals(author);
    }
}

/**
 * BookFilter implementation to filter books published after a certain year.
 */
class YearPublishedFilter implements BookFilter {
    private int year; // Year to filter by

    /**
     * Constructor to initialize YearPublishedFilter with a year.
     * 
     * @param year The year to filter by.
     */
    public YearPublishedFilter(int year) {
        this.year = year;
    }

    /**
     * Method to apply the year filter to a book.
     * 
     * @param book The book to apply the filter to.
     * @return True if the book's publication year is after the filter year, false otherwise.
     */
    @Override
    public boolean apply(Book book) {
        return book.getYearPublished() > year;
    }
}

/**
 * BookSearcher class that uses BookFilter to search for books.
 */
class BookSearcher {
    /**
     * Method to search for books using a given filter.
     * 
     * @param books  The list of books to search through.
     * @param filter The filter to apply during the search.
     * @return A list of books that pass the filter criteria.
     */
    public List<Book> search(List<Book> books, BookFilter filter) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (filter.apply(book)) { // Apply the filter to each book
                result.add(book); // If the book passes the filter, add it to the result list
            }
        }
        return result;
    }
}

/*    
    The BookSearcher class is closed for modification and open for extension. 
    If a new type of filter needs to be added (e.g., filtering books by publisher), 
    it can be done without modifying the BookSearcher class.
*/
