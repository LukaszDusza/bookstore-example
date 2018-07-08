package pl.akademiakodu.bookstoreexample.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Repository
public interface BookRepository extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {

String FIND_BY_ISBN = "select * from book where isbn = ?1";
String UPDATE_BOOK_BY_ISBN = "update book set price = ?2 where isbn = ?1";
String FIND_BY_TITLE = "select * from book where title like ?1%";

@Async
@Query(value = FIND_BY_ISBN, nativeQuery = true)
List<Book> findByIsbn(String isbn);

@Async
@Query(value = UPDATE_BOOK_BY_ISBN, nativeQuery = true)
Book updatePrice(String isbn, double price);

@Async
@Query(value = FIND_BY_TITLE, nativeQuery = true)
List<Book> findByTitle(String title);

}
