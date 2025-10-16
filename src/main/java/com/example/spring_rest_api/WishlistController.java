package com.example.spring_rest_api;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
public class WishlistController {
    WishlistStore wishliststore = WishlistStore.getInstance();
    Bookstore bookstore = new Bookstore();

    @PostMapping("/users/{userId}/wishlist")
    public List<Book> addBookToWishlist(@PathVariable int userId, @RequestBody Book book) {
        wishliststore.addBookToWishlist(userId, book);
        return wishliststore.getWishlistByUserId(userId).getList();
    }
    @DeleteMapping("/users/{userId}/wishlist/{bookId}")
    public List<Book> removeBookFromWishlist(@PathVariable int userId, @PathVariable int bookId) {
        wishliststore.deleteBookFromWishlist(userId, bookId);
        return wishliststore.getWishlistByUserId(userId).getList();
    }
    @GetMapping("/users/{userId}/wishlist")
    public List<Book> getWishlistByUserId(@PathVariable int userId){
        System.out.println("Wishlist for user" + userId + " is: " + wishliststore.getWishlistByUserId(userId).getList());
        return wishliststore.getWishlistByUserId(userId).getList();
    }
}
