package com.twu.biblioteca;

public class User {
    private String id;
    private String password;
    private Boolean superUser;

    public User(String id, String password) {
        this.id = id;
        this.password = password;
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

    public String getId() {
        return id;
    }

    public Boolean isSuperUser() {
        return superUser;
    }
}
