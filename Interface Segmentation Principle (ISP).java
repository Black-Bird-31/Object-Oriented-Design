/*
 * Program Title: A JAVA program demonstrating Interface Segregation Principle of SOLID.
 * Author: Md. Habibur Rahman, CSEKU.
 */

import java.util.*;

// Interface for Document
interface Document {
    // Method to open a document
    void open();
    
    // Method to close a document
    void close();
    
    // Method to save a document
    void save();
}

// TextDocument class implementing Document
class TextDocument implements Document {
    private String content; // Content of the text document

    // Method to open a text document
    @Override
    public void open() {
        System.out.println("Text document opened");
    }

    // Method to close a text document
    @Override
    public void close() {
        System.out.println("Text document closed");
    }

    // Method to save a text document
    @Override
    public void save() {
        System.out.println("Text document saved");
    }

    // Additional method to set content of the text document
    public void setContent(String content) {
        this.content = content;
    }

    // Additional method to get content of the text document
    public String getContent() {
        return content;
    }
}

// Printable interface for documents that can be printed
interface Printable {
    // Method to print a document
    void print();
}

// TextDocumentWithPrinting class implementing both Document and Printable
class TextDocumentWithPrinting implements Document, Printable {
    private String content; // Content of the text document

    // Method to open a text document
    @Override
    public void open() {
        System.out.println("Text document opened");
    }

    // Method to close a text document
    @Override
    public void close() {
        System.out.println("Text document closed");
    }

    // Method to save a text document
    @Override
    public void save() {
        System.out.println("Text document saved");
    }

    // Method to print a text document
    @Override
    public void print() {
        System.out.println("Printing text document:");
        System.out.println(content);
    }

    // Additional method to set content of the text document
    public void setContent(String content) {
        this.content = content;
    }

    // Additional method to get content of the text document
    public String getContent() {
        return content;
    }
}
