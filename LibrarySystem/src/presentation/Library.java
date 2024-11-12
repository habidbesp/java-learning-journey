package presentation;

import domain.Book;
import service.IServiceBooks;
import service.ServiceBooksFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        library();
    }

    public static void library(){
        var exit = false;
        var console = new Scanner(System.in);

        // Creating a new instance of ServiceBooksList to access
        // the book service (implements IServiceBooks)
        IServiceBooks serviceBooks = new ServiceBooksFiles();

        // Creating a list of products of type Book
        List<Book> books = new ArrayList<>();
        System.out.println("*** Library Service ***");
        serviceBooks.showBooks(); // Display the inventory of books

        while (!exit){
            try{
                var option = showMenu(console);
                exit = executeOptions(option, console, serviceBooks);
            } catch (Exception e) {
                System.out.println("An error has occurred: " + e.getMessage());
            }
            finally {
                System.out.println(); // Print a new line after each operation
            }
        }
    }

    private static int showMenu(Scanner console){
        System.out.print("""
                Menu:
                1. Register a book
                2. Register a new user
                3. Lend a book
                4. Return a book
                5. List all available books
                6. List all active loans
                7. Exit
                Choose an option:\s""");
        // Read and return the chosen option
        return Integer.parseInt(console.nextLine());
    }

    private static boolean executeOptions(
            int option,
            Scanner console,
            IServiceBooks serviceBooks
    ){
        var exit = false;
        switch (option){
            case 1 -> registerBook(console, serviceBooks);
            case 7 -> {
                System.out.println("Thanks for stopping by, come back anytime!");
                exit = true;
            }
            default -> System.out.println("Invalid Option: " + option);
        }
        return exit;
    }

    private static void registerBook(Scanner console, IServiceBooks serviceBooks){
        System.out.println("\nProvide the following data for the new book: ");
        System.out.print("Enter ISBN: ");
        var ISBN = console.nextLine();

        System.out.print("Enter the title: ");
        var title = console.nextLine();

        System.out.print("Enter the author: ");
        var author = console.nextLine();

        System.out.print("Enter the publisher: ");
        var publisher = console.nextLine();

        System.out.print("Is the book in stock (true/false)? ");
        var isAvailable = Boolean.parseBoolean(console.nextLine());

        serviceBooks.addBook(new Book(ISBN, title, author, publisher, isAvailable));
        System.out.println("Book added successfully");
        serviceBooks.showBooks();
    }

}
