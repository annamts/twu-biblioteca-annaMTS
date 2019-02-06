package com.twu.biblioteca;

public class LogIn {
    static void run() {
        Output.askForUserId();
        String id = Input.get();
        logInUser(id);
    }

    private static void logInUser(String id) {
        if (Users.userIdExists(id)) {
            User user = Users.findUser(id);
            logInPassword(user, getPassword());
        } else {
            Output.wrongUserId();
        }
    }

    protected static void logInPassword(User user, String pass) {
        if(user.checkPassword(pass)) {
            UI.setUser(user);
        } else {
            Output.wrongPassword();
        }
    }

    private static String getPassword() {
        Output.askForPassword();
        return Input.get();
    }
}
