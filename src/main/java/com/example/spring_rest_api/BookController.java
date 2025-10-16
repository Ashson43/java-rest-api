package com.example.spring_rest_api;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class BookController {

    Bookstore bookstore = new Bookstore();

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookstore.getBooks();

    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookstore.getBookById(id);

    }

    @DeleteMapping("/books/{id}")
    public void deleteBookById(@PathVariable int id) {
        bookstore.removeBookById(id);

    }

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        return bookstore.addBook(book);
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@RequestBody Book book,@PathVariable int id) {
        book.setId(id);
        bookstore.updateBookById(book);
        return book;
    }

}
