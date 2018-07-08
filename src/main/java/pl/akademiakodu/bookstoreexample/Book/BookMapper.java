package pl.akademiakodu.bookstoreexample.Book;

import pl.akademiakodu.bookstoreexample.Author.Author;
import pl.akademiakodu.bookstoreexample.common.Mapper;

import java.util.function.Function;
import java.util.stream.Collectors;

//implementacja kodu do zamiany obiekt domenowy Book na BookDTO.

public class BookMapper implements Mapper<Book, BookDto> {

    @Override
    public BookDto map(Book from) {
        String authors = from.getAuthors()
                .stream()
                .map(AuthorToNameAndSurname.INSTANCE)
                .collect(Collectors.joining(", "));
        return new BookDto(from.getIsbn(), from.getTitle(), authors, String.valueOf(from.getPrice()));

    }

    private enum AuthorToNameAndSurname implements Function<Author,String> {
        INSTANCE;

        @Override
        public String apply(Author author) {
            return author.getName() + " " + author.getLastName();
        }
    }
}
