package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public static final List<User> USERS = new ArrayList<>();
    public static final User NO_USER = new User("", "");
    public static final User LIBRARIAN = new User("456-7891", "pass4", true);

    static {
        USERS.add(new User("123-4567", "pass1", "Perico de los Palotes", "perico@gmail.com", "012345678"));
        USERS.add(new User("234-5678", "pass2", "Fulano de Tal", "fulano@gmail.com", "123456789"));
        USERS.add(new User("345-6789", "pass3", "Mengano de Cual", "mengano@gmail.com", "234567891"));
        USERS.add(LIBRARIAN);
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
