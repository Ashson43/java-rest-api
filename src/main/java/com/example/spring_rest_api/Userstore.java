package com.example.spring_rest_api;
import java.util.ArrayList;
import java.util.List;

public class Userstore {
    int userId=1;
    List<User> users=new ArrayList<>();
    WishlistStore wishlistStore=WishlistStore.getInstance();

    public User adduser(String name){
        User user=new User(name,userId);
        users.add(user);
        wishlistStore.createUserWishlist(userId);
        userId++;
        return user;
    }

    public User getUserById(int userId){
        for (User user : users) {
            if(user.getId()==userId)
            return user;
        }
        return null;
    }
    public List<User> getUsers(){
        return users;
    }
    public void updateUserById(User updatedUser) {
        for (User user : users) {
            if (user.getId()==(updatedUser.getId())) {
                user.setName(updatedUser.getName());
                
            }
        }
    }
    public void removeBookById(int id) {
        int i=0;
        for (User user : users) {
            if (user.getId()==(id)) {
                users.remove(i);
            }
        i++;
        }
    }

}
