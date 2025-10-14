package com.example.spring_rest_api;

import java.util.HashMap;
import java.util.Map;

public class WishlistStore {
    
    private static final WishlistStore INSTANCE = new WishlistStore();
    private Map<Integer, Wishlist> userWishlist = new HashMap<>();

    private WishlistStore() {}

    public static WishlistStore getInstance() {
        return INSTANCE;
    }

    public void createUserWishlist(int id) {
        Wishlist wishlist = new Wishlist();
        System.out.println("Creating wishlist for user with id :" + id + "The wishlist is " + wishlist);
        userWishlist.put(id, wishlist);
    }

    public void addBookToWishlist(int userId, Book book) {
        userWishlist.get(userId).addBookToWishlist(book);
    }

    public void deleteBookFromWishlist(int userId, Book book) {
        userWishlist.get(userId).removeBookFromWishlist(userId);
    }

    public Wishlist getWishlistByUserId(int userId) {
        return userWishlist.get(userId);
    }
}
