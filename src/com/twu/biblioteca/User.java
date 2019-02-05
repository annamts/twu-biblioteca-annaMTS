package com.twu.biblioteca;

public class User {
    private String id;
    private String password;
    private String name;
    private String email;
    private String phoneNumber;
    private Boolean superUser;

    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public User(String id, String password, String name, String email, String phoneNumber) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.superUser = false;
    }

    public User(String id, String password, Boolean superUser) {
        this.id = id;
        this.password = password;
        this.superUser = superUser;
    }

    public Boolean checkPassword(String password) {
        return password.equals(this.password);
    }

    public String getUserInfo() {
        return "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Phone number: " + phoneNumber + "\n";
    }

    public String getId() {
        return id;
    }

    public Boolean isSuperUser() {
        return superUser;
    }
}
