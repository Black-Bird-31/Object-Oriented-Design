
/*
 * Program Title: A JAVA program demonstrating Liskov Substitution Prinicple of SOLID.
 * Author: Md. Habibur Rahman, CSEKU.
 */


 import java.util.*;


// User class
class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter method for the name of the user
    public String getName() {
        return name;
    }

    // Setter method for the name of the user
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the email of the user
    public String getEmail() {
        return email;
    }

    // Setter method for the email of the user
    public void setEmail(String email) {
        this.email = email;
    }
}

// LibraryUser class extending User with getter and setter methods
class LibraryUser extends User {
    private int libraryId;

    public LibraryUser(String name, String email, int libraryId) {
        super(name, email);
        this.libraryId = libraryId;
    }

    // Getter method for the library ID of the user
    public int getLibraryId() {
        return libraryId;
    }

    // Setter method for the library ID of the user
    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }
}

// LibraryAdmin class extending User with getter and setter methods
class LibraryAdmin extends User {
    private boolean isAdmin;

    public LibraryAdmin(String name, String email, boolean isAdmin) {
        super(name, email);
        this.isAdmin = isAdmin;
    }

    // Getter method for the admin status of the user
    public boolean isAdmin() {
        return isAdmin;
    }

    // Setter method for the admin status of the user
    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}

public class LibraryUserExample {
    public static void main(String[] args) {
        // Create LibraryUser instance
        LibraryUser user1 = new LibraryUser("John Doe", "john@example.com", 123456);

        // Create LibraryAdmin instance
        LibraryAdmin user2 = new LibraryAdmin("Jane Smith", "jane@example.com", true);

        // Display user information
        System.out.println("Library User:");
        System.out.println("Name: " + user1.getName());
        System.out.println("Email: " + user1.getEmail());
        System.out.println("Library ID: " + user1.getLibraryId());

        System.out.println("\nLibrary Admin:");
        System.out.println("Name: " + user2.getName());
        System.out.println("Email: " + user2.getEmail());
        System.out.println("Is Admin: " + user2.isAdmin());
    }
}
