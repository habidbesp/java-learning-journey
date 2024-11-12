package domain;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {
    private String ISBN;
    private String title;
    private String author;
    private String publisher;
    private boolean isAvailable;

    public Book(){
    }

    public Book(String ISBN, String title, String author, String publisher, boolean isAvailable){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isAvailable = isAvailable;
    }

    public String getISBN() {
        return this.ISBN;
    }

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

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public String writeBook(){
        return ISBN + "," + title + "," + author + "," + publisher + "," + isAvailable;
    }

    @Override
    public boolean equals(Object o) {
        // 1. If the two objects are the same (memory reference), they are equal.
        if (this == o) return true;

        // 2. If the object is null or if the objects are of different classes, they are not equal.
        if (o == null || getClass() != o.getClass()) return false;

        // 3. Cast the object in order to compare its attributes.
        Book book = (Book) o;

        // 4. We compare the relevant attributes to determine if the objects are equal.
        return Objects.equals(ISBN, book.ISBN)
                && Objects.equals(title, book.title)
                && Objects.equals(author, book.author)
                && Objects.equals(publisher, book.publisher)
                && Objects.equals(isAvailable, book.isAvailable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, title, author, publisher, isAvailable);
    }
}
