package com.danielogbuti.post;

public class User {

    private Integer id;
    private String name;
    private String email;
    private String[] topics;
    private int age;

    public User(String name, String email, String[] topics, int age) {
        this.name = name;
        this.email = email;
        this.topics = topics;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }
}
