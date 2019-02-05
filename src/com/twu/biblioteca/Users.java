package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public static final List<User> USERS = new ArrayList<>();
    public static final User NO_USER = new User("", "");
    static {
        USERS.add(new User("user1", "pass1"));
        USERS.add(new User("user2", "pass2"));
        USERS.add(new User("user3", "pass3"));
    }

    public static Boolean userIdExists(String id) {
        for (User user : USERS) {
            if (user.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static User findUser(String id) {
        for (User user : USERS) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

}
