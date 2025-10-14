package com.example.spring_rest_api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BookStoreTest {
    
    @Test
    public void testNewBookStore(){

        //Arrange
        Bookstore store = new Bookstore();
        
        //Act
        var books = store.getBooks();

        //Assert
        assertEquals(0, books.size());

    }


    @Test
    public void testAddBook(){

        //Arrange
        Bookstore store = new Bookstore();
        Book book = new Book(0,"Finding Vrushank", "Vrushank Joshi");

        //Act
        var addedBook = store.addBook(book);

        //Assert
        
        assertEquals(1, store.getBooks().size());

        var actualAddedBook = store.getBooks().get(0);
        assertEquals(addedBook, actualAddedBook);
        assertEquals(1, actualAddedBook.getId());
        assertEquals("Finding Vrushank", actualAddedBook.getTitle());
        assertEquals("Vrushank Joshi", actualAddedBook.getAuthor());

    }
    @Test
    public void testUpdateBook(){

        //Arrange
        Bookstore store = new Bookstore();
        Book book = new Book(1,"Finding Vrushank", "Vrushank Joshi");
        Book updatedBook= new Book(1,"Found Vrushank","Vrushank");

        //Act
        store.addBook(book);
        store.updateBookById(updatedBook);
        //Assert
        
        var actualAddedBook = store.getBooks().get(0);
        assertEquals(updatedBook.getTitle(), actualAddedBook.getTitle());
        assertEquals(updatedBook.getAuthor(), actualAddedBook.getAuthor());

    }
    @Test
    public void testGetById(){
        //Arrange
        Bookstore store=new Bookstore();
        Book book=new Book(1,"Finding Vrushank", "Vrushank Joshi");
        store.addBook(book);
        //Act
        Book book2=store.getBookById(book.getId());
        //Assert
        assertEquals(book,book2);
    }
    @Test
    public void testDelBook(){
        //Arrange
        Bookstore store=new Bookstore();
        
        Book book=new Book(1,"Finding Vrushank", "Vrushank Joshi");
        store.addBook(book);
        assertEquals(1,store.getBooks().size());

        //Act
        store.removeBookById(book.getId());
        //Assert
        assertEquals(0,store.getBooks().size());
    }


}
