/*
 * Program Title: A JAVA program demonstrating Interface Segregation Principle (ISP) of SOLID.
 * Author: Md. Habibur Rahman, CSEKU.

 ISP: Clients should not be forced to depend on interfaces they don't use. 
 This means that large interfaces should be split into smaller, 
 more specific ones so that clients only need to know about the methods that are of interest to them.
  
 */

import java.util.*;

/**
 * Interface representing a document.
 */
interface Document {
    /**
     * Method to open a document.
     */
    void open();

    /**
     * Method to close a document.
     */
    void close();

    /**
     * Method to save a document.
     */
    void save();
}

/**
 * Class representing a text document implementing the Document interface.
 */
class TextDocument implements Document {
    private String content; // Content of the text document

    /**
     * Method to open a text document.
     */
    @Override
    public void open() {
        System.out.println("Text document opened");
    }

    /**
     * Method to close a text document.
     */
    @Override
    public void close() {
        System.out.println("Text document closed");
    }

    /**
     * Method to save a text document.
     */
    @Override
    public void save() {
        System.out.println("Text document saved");
    }

    /**
     * Method to set content of the text document.
     * @param content The content to set.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Method to get content of the text document.
     * @return The content of the text document.
     */
    public String getContent() {
        return content;
    }
}

/**
 * Interface representing a printable document.
 */
interface Printable {
    /**
     * Method to print a document.
     */
    void print();
}

/**
 * Class representing a text document with printing capabilities implementing both Document and Printable interfaces.
 */
class TextDocumentWithPrinting implements Document, Printable {
    private String content; // Content of the text document

    /**
     * Method to open a text document.
     */
    @Override
    public void open() {
        System.out.println("Text document opened");
    }

    /**
     * Method to close a text document.
     */
    @Override
    public void close() {
        System.out.println("Text document closed");
    }

    /**
     * Method to save a text document.
     */
    @Override
    public void save() {
        System.out.println("Text document saved");
    }

    /**
     * Method to print a text document.
     */
    @Override
    public void print() {
        System.out.println("Printing text document:");
        System.out.println(content);
    }

    /**
     * Method to set content of the text document.
     * @param content The content to set.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Method to get content of the text document.
     * @return The content of the text document.
     */
    public String getContent() {
        return content;
    }
}
