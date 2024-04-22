// Example: A Book class adhering to SRP

class Book {
    private String title;
    private String author;
    private String content;

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    // Getters and setters for title, author, and content

    // Other methods related to book functionality (e.g., read, print, etc.)
}

class BookPrinter {
    public void print(Book book) {
        // Logic to print book details (title, author, etc.)
        System.out.println("Printing book: " + book.getTitle());
        // ...
    }
}

class BookPersistence {
    public void save(Book book) {
        // Logic to save book to a database or file
        // ...
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", "...");
        
        // BookPrinter handles printing responsibilities
        BookPrinter printer = new BookPrinter();
        printer.print(book);

        // BookPersistence handles persistence responsibilities
        BookPersistence persistence = new BookPersistence();
        persistence.save(book);
    }
}
