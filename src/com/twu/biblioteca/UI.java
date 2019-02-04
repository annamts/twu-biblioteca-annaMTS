package com.twu.biblioteca;

public class UI {

    public static void startUI() {
        Output.firstGreeting();
        Output.displayMainMenu();
        String input = Input.get();
        while(!input.equals(Input.QUIT)) {
            respondToInput(input);
            Output.displayMainMenu();
            input = Input.get();
        }
        Output.goodbyeMessage();
    }

    public static void respondToInput(String input) {
        switch(Input.getFirstLetter(input)) {
            case Input.BOOK_LIST:
                Output.displayListOfBooks();
                break;
            case Input.MOVIE_LIST:
                Output.displayListOfMovies();
                break;
            case Input.CHECK_OUT:
                Boolean checkOutSuccess = BookManager.checkOut(Input.extractBookTitle(input));
                Output.checkOut(checkOutSuccess);
                break;
            case Input.RETURN:
                Boolean returnSuccess = BookManager.returnBook(Input.extractBookTitle(input));
                Output.returnBook(returnSuccess);
                break;
            default:
                Output.wrongInput();
        }
    }
}
