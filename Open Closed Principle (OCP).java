// Interface for BookFilter
interface BookFilter {
    boolean apply(Book book);
}

// BookFilter implementation to filter books by author
class AuthorFilter implements BookFilter {
    private String author;

    public AuthorFilter(String author) {
        this.author = author;
    }

    @Override
    public boolean apply(Book book) {
        return book.getAuthor().equals(author);
    }
}

// BookFilter implementation to filter books published after a certain year
class YearPublishedFilter implements BookFilter {
    private int year;

    public YearPublishedFilter(int year) {
        this.year = year;
    }

    @Override
    public boolean apply(Book book) {
        return book.getYearPublished() > year;
    }
}

// BookSearcher class that uses BookFilter to search for books
class BookSearcher {
    public List<Book> search(List<Book> books, BookFilter filter) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (filter.apply(book)) {
                result.add(book);
            }
        }
        return result;
    }
}
