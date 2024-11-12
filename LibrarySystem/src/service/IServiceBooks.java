package service;

import domain.Book;

import java.util.List;

public interface IServiceBooks {
    void addBook(Book book);
    void showBooks();
    List<Book> getBooks();
}
