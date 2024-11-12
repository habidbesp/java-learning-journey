package service;

import domain.Book;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServiceBooksFiles implements IServiceBooks {
    private final String BOOKS_FILE = "books.txt";

    // Create books list
    private List<Book> books = new ArrayList<>();

    // Constructor
    public ServiceBooksFiles(){
        // Create the file if not exist
        var file = new File(BOOKS_FILE);
        var fileExist = false;
        try {
            fileExist = file.exists();
            if (fileExist)
                this.books = getFileBooks();
            else{
                var output = new PrintWriter(new FileWriter(file));
                output.close(); // Saving the file on the hard drive
                System.out.println("File created successfully.");
            }
        } catch (Exception e) {
            System.out.println("Error: while creating file: " + e.getMessage());
        }
        // if the file does not exist, load some initial values.
        if(!fileExist)
            loadInitialBooks();
    }

    private void loadInitialBooks(){
        this.addBook(new Book("978-0140449136", "The Odyssey",
                "Homer", "Penguin Classics", true));
        this.addBook(new Book("978-0061120084", "To Kill a Mockingbird",
                "Harper Lee", "Harper Perennial Modern Classics", true));
        this.addBook(new Book("978-0451524935", "1984", "George Orwell",
                "Signet Classic", true));
    }

    private List<Book> getFileBooks(){
        var books = new ArrayList<Book>();
        try{
            List<String> lines = Files.readAllLines(Paths.get(BOOKS_FILE));
            for(String line: lines){
                String[] lineBook = line.split(",");
                var ISBN = lineBook[0];
                var title = lineBook[1];
                var author = lineBook[2];
                var publisher = lineBook[3];
                var isAvailable = Boolean.parseBoolean(lineBook[4]);

                var book = new Book(ISBN, title, author, publisher, isAvailable);
                books.add(book); // Add the read book to the list
            }
        } catch (Exception e) {
            System.out.println("Error while reading file 'snacks': " + e.getMessage());
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public void addBook(Book book) {
        // Add a new snack:
        // 1. Save it in the in-memory list
        this.books.add(book);
        // 2. Save the new book to a file
        this.addBookFile(book);
    }

    private void addBookFile(Book book){
        boolean attach = false;
        var file = new File(BOOKS_FILE);
        try{
            attach = file.exists();
            var output = new PrintWriter(new FileWriter(file, attach));
            output.println(book.writeBook());
            output.close();
        } catch (Exception e) {
            System.out.println("Error while adding snack: " + e.getMessage());
        }
    }

    @Override
    public void showBooks() {
        System.out.println("--- Book Inventory ---");
        // Show list of snacks in the file
        var inventoryBooks = "";
        for(var book: this.books){
            inventoryBooks += book.toString() + "\n";
        }
        System.out.println(inventoryBooks);
    }

    @Override
    public List<Book> getBooks() {
        return List.of();
    }
}
