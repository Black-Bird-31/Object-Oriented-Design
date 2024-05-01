/*
 * Program Title: A JAVA program demonstrating Liskov Substitution Principle of SOLID.
 * Author: Md. Habibur Rahman, CSEKU.

 LSP: The Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with 
 objects of its subclasses without affecting the correctness of the program.
 
 */


import java.util.*;

/**
 * User class representing a generic user with name and email.
 */
class User {
    private String name; // Name of the user
    private String email; // Email of the user

    /**
     * Constructor to initialize a User object with name and email.
     * 
     * @param name  The name of the user.
     * @param email The email of the user.
     */
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Getter method for the name of the user.
     * 
     * @return The name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for the name of the user.
     * 
     * @param name The new name of the user.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for the email of the user.
     * 
     * @return The email of the user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for the email of the user.
     * 
     * @param email The new email of the user.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}

/**
 * LibraryUser class extending User, representing a user of the library.
 */
class LibraryUser extends User {
    private int libraryId; // ID of the library user

    /**
     * Constructor to initialize a LibraryUser object with name, email, and library ID.
     * 
     * @param name      The name of the user.
     * @param email     The email of the user.
     * @param libraryId The ID of the library user.
     */
    public LibraryUser(String name, String email, int libraryId) {
        super(name, email); // Call the constructor of the superclass User
        this.libraryId = libraryId;
    }

    /**
     * Getter method for the library ID of the user.
     * 
     * @return The library ID of the user.
     */
    public int getLibraryId() {
        return libraryId;
    }

    /**
     * Setter method for the library ID of the user.
     * 
     * @param libraryId The new library ID of the user.
     */
    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }
}

/**
 * LibraryAdmin class extending User, representing an administrator of the library.
 */
class LibraryAdmin extends User {
    private boolean isAdmin; // Flag indicating if the user is an admin

    /**
     * Constructor to initialize a LibraryAdmin object with name, email, and admin status.
     * 
     * @param name    The name of the user.
     * @param email   The email of the user.
     * @param isAdmin Flag indicating if the user is an admin.
     */
    public LibraryAdmin(String name, String email, boolean isAdmin) {
        super(name, email); // Call the constructor of the superclass User
        this.isAdmin = isAdmin;
    }

    /**
     * Getter method for the admin status of the user.
     * 
     * @return True if the user is an admin, false otherwise.
     */
    public boolean isAdmin() {
        return isAdmin;
    }

    /**
     * Setter method for the admin status of the user.
     * 
     * @param isAdmin The new admin status of the user.
     */
    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}

/**
 * A simple example class demonstrating the usage of LibraryUser and LibraryAdmin classes.
 */
public class LibraryUserExample {
    /**
     * Main method to run the example code.
     * 
     * @param args Command-line arguments (not used in this example).
     */
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
