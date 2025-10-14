package com.example.spring_rest_api;

import java.util.ArrayList;
import java.util.List;

public class Wishlist {

    private List<Book> wishlist= new ArrayList<Book>();

    public List<Book> getList() {
        return wishlist;
    }

    public void addBookToWishlist(Book book){
        wishlist.add(book);
    }
    public void removeBookFromWishlist(int id){
        for (int i=0;i<wishlist.size();i++) {
            if(wishlist.get(i).getId()==id){
                wishlist.remove(i);
            }
        }
    }
}
