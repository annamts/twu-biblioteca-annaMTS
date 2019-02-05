package com.twu.biblioteca;

public class UI {

    private static User user = Users.NO_USER;

    public static void startUI() {
        Output.firstGreeting();
        Output.displayMainMenu();
        String input = Input.get();
        while(!input.equals(Input.QUIT)) {
            respondToInput(input);
            if(user == Users.NO_USER) {
                Output.displayMainMenu();
            } else if (user.isSuperUser()) {
                Output.displayListOfCheckedOutBooks();
            } else {
                Output.displayUserMenu();
            }
            input = Input.get();
        }
        Output.goodbyeMessage();
    }

    public static void respondToInput(String input) {
        switch(Input.getFirstLetter(input)) {
            case Input.BOOK_LIST:
                Output.displayListOfBooks();
                break;
            case Input.LOG_IN:
                LogIn.logIn();
                break;
            case Input.MOVIE_LIST:
                Output.displayListOfMovies();
                break;
            case Input.CHECK_OUT_BOOK:
                if(user != Users.NO_USER) {
                    Boolean checkOutBookSuccess = BookManager.checkOut(Input.extractBookTitle(input));
                    Output.checkOutBook(checkOutBookSuccess);
                } else {
                    Output.notLoggedIn();
                }
                break;
            case Input.CHECK_OUT_MOVIE:
                Boolean checkOutMovieSuccess = MovieManager.checkOut(Input.extractBookTitle(input));
                Output.checkOutMovie(checkOutMovieSuccess);
                break;
            case Input.RETURN:
                if(user == Users.NO_USER) {
                    Output.notLoggedIn();
                } else {
                    Boolean returnSuccess = BookManager.returnBook(Input.extractBookTitle(input));
                    Output.returnBook(returnSuccess);
                }
                break;
            case Input.USER_INFO:
                if(user == Users.NO_USER) {
                    Output.wrongInput();
                } else {
                    Output.displayUserInfo();
                }
                break;
            default:
                Output.wrongInput();
        }
    }

    public static void setUser(User user) {
        UI.user = user;
    }

    public static User getUser() {
        return user;
    }
}
