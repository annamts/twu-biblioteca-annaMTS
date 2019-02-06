package com.twu.biblioteca;

public class MenuActions {
    static void showUserInfo() {
        if(UI.getUser() == Users.NO_USER) {
            Output.wrongInput();
        } else {
            Output.displayUserInfo();
        }
    }

    static void checkOutBook() {
        if(UI.getUser() != Users.NO_USER) {
            Boolean checkOutBookSuccess = BookManager.checkOut(Input.extractBookTitle(UI.getInput())); //this won't work, you need to get the input in here...
            Output.checkOutBook(checkOutBookSuccess);
        } else {
            Output.notLoggedIn();
        }
    }

    static void checkOutMovie() {
        Boolean checkOutMovieSuccess = MovieManager.checkOut(Input.extractBookTitle(UI.getInput())); //this won't work, it needs input
        Output.checkOutMovie(checkOutMovieSuccess);
    }

    static void returnBook() {
        if(UI.getUser() == Users.NO_USER) {
            Output.notLoggedIn();
        } else {
            Boolean returnSuccess = BookManager.returnBook(Input.extractBookTitle(UI.getInput()));
            Output.returnBook(returnSuccess);
        }
    }

    static void logIn() {
        LogIn.run();
    }
}
