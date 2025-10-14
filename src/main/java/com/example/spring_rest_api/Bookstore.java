package com.example.spring_rest_api;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    int id = 1;
    private List<Book> bookList = new ArrayList<>();

    public Book addBook(Book book) {
        book.setId(id);
        bookList.add(book);

        
        id++;
        return book;
    }

    public Book getBookById(int id) {
        for (Book book : bookList) {
            if (book.getId()==id) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getBooks() {
        return bookList;
    }

    public void updateBookById(Book updatedBook) {
        for (Book book : bookList) {
            if (book.getId()==(updatedBook.getId())) {
                book.setTitle(updatedBook.getTitle());
                book.setauthor(updatedBook.getAuthor());
            }
        }
    }

    public void removeBookById(int id) {
        var size = bookList.size();
        for (int i = size - 1; i >= 0; i--) {
            if (bookList.get(i).getId()==id) {
                bookList.remove(i);
            }
        }
    }

}
