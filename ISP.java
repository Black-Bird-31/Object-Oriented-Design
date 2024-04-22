// Interface for Document
interface Document {
    void open();
    void close();
    void save();
}

// TextDocument class implementing Document
class TextDocument implements Document {
    @Override
    public void open() {
        // Code to open text document
    }

    @Override
    public void close() {
        // Code to close text document
    }

    @Override
    public void save() {
        // Code to save text document
    }
}

// Printable interface for documents that can be printed
interface Printable {
    void print();
}

// TextDocumentWithPrinting class implementing both Document and Printable
class TextDocumentWithPrinting implements Document, Printable {
    @Override
    public void open() {
        // Code to open text document
    }

    @Override
    public void close() {
        // Code to close text document
    }

    @Override
    public void save() {
        // Code to save text document
    }

    @Override
    public void print() {
        // Code to print text document
    }
}
