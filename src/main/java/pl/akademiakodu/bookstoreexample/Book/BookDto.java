package pl.akademiakodu.bookstoreexample.Book;

import java.io.Serializable;

public class BookDto implements Serializable {
    private String isbn;
    private String title;
    private String authors;
    private String price;

    public BookDto(String isbn, String title, String authors, String price) {
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public BookDto(String isbn, String title, String price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    public BookDto() { }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
