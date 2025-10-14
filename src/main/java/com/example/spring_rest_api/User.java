package com.example.spring_rest_api;


public class User {
    private String name="";
    private int id=1;
    public User(String name,int id){
        this.name=name;
        this.id=id;
    }
    public int getId(){

        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    
}
