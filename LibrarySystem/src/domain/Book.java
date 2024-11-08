package domain;

import java.io.Serializable;

public class Book implements Serializable {
    private String ISBN;
    private String title;
    private String author;
    private String publisher;
    private boolean isAvailable;

    public Book(){
        this.isAvailable = true;
    }

    public Book(String ISBN, String title, String author, String publisher){
        this();
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getISBN() {
        return this.ISBN;
    }

//    public void setISBN(String ISBN) {
//        this.ISBN = ISBN;
//    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}
