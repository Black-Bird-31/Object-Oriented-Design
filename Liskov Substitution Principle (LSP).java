// User class
class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters
}

// LibraryUser class extending User
class LibraryUser extends User {
    private int libraryId;

    public LibraryUser(String name, String email, int libraryId) {
        super(name, email);
        this.libraryId = libraryId;
    }

    // Getters and setters
}

// LibraryAdmin class extending User
class LibraryAdmin extends User {
    private boolean isAdmin;

    public LibraryAdmin(String name, String email, boolean isAdmin) {
        super(name, email);
        this.isAdmin = isAdmin;
    }

    // Getters and setters
}
