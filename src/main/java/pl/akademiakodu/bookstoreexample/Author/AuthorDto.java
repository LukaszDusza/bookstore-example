package pl.akademiakodu.bookstoreexample.Author;

import java.io.Serializable;

public class AuthorDto implements Serializable {

    private String name;
    private String lastName;
    private String books;

    public AuthorDto(String name, String lastName, String books) {
        this.name = name;
        this.lastName = lastName;
        this.books = books;
    }

    public AuthorDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }
}
