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
    }

    @Override
    public void removeBook(Book book) {
        // Code to remove book from database
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

    // Methods using LibraryService
}
