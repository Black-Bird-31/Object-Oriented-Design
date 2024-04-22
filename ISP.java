
/*
 * Program Title: A JAVA program demonstrating Single Responsibility Prinicple of SOLID.
 * Author: Md. Habibur Rahman, CSEKU.
 */

import java.util.*;


// Interface for Document
interface Document {
    void open();
    void close();
    void save();
}

// TextDocument class implementing Document
class TextDocument implements Document {
    private String content;

    @Override
    public void open() {
        System.out.println("Text document opened");
    }

    @Override
    public void close() {
        System.out.println("Text document closed");
    }

    @Override
    public void save() {
        System.out.println("Text document saved");
    }

    // Additional method to set content
    public void setContent(String content) {
        this.content = content;
    }

    // Additional method to get content
    public String getContent() {
        return content;
    }
}

// Printable interface for documents that can be printed
interface Printable {
    void print();
}

// TextDocumentWithPrinting class implementing both Document and Printable
class TextDocumentWithPrinting implements Document, Printable {
    private String content;

    @Override
    public void open() {
        System.out.println("Text document opened");
    }

    @Override
    public void close() {
        System.out.println("Text document closed");
    }

    @Override
    public void save() {
        System.out.println("Text document saved");
    }

    @Override
    public void print() {
        System.out.println("Printing text document:");
        System.out.println(content);
    }

    // Additional method to set content
    public void setContent(String content) {
        this.content = content;
    }

    // Additional method to get content
    public String getContent() {
        return content;
    }
}
