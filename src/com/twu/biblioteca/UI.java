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
                Output.askForUserId();
                String id = Input.get();
                if (Users.userIdExists(id)) {
                    User currentUser = Users.findUser(id);
                    Output.askForPassword();
                    String pass = Input.get();
                    if(currentUser.checkPassword(pass)) {
                        user = currentUser;
                    } else {
                        Output.wrongPassword();
                    }
                } else {
                    Output.wrongUserId();
                }
                break;
            case Input.MOVIE_LIST:
                Output.displayListOfMovies();
                break;
            case Input.CHECK_OUT_BOOK:
                //check if user is logged in
                Boolean checkOutBookSuccess = BookManager.checkOut(Input.extractBookTitle(input));
                Output.checkOutBook(checkOutBookSuccess);
                break;
            case Input.CHECK_OUT_MOVIE:
                Boolean checkOutMovieSuccess = MovieManager.checkOut(Input.extractBookTitle(input));
                Output.checkOutMovie(checkOutMovieSuccess);
                break;
            case Input.RETURN:
                //check if user is logged in and has this book
                Boolean returnSuccess = BookManager.returnBook(Input.extractBookTitle(input));
                Output.returnBook(returnSuccess);
                break;
            default:
                Output.wrongInput();
        }
    }
}
