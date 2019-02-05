package com.twu.biblioteca;

public class Output {
    private static final String GREETING = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n";
    private static final String WRONG_INPUT = "Please select a valid option!\n";
    private static final String WRONG_USER_ID = "That user id does not exist\n";
    private static final String WRONG_PASSWORD = "Wrong password!\n";
    private static final String SUCCESSFUL_BOOK_CHECKOUT = "Thank you! Enjoy the book\n";
    private static final String UNSUCCESSFUL_BOOK_CHECKOUT = "Sorry, that book is not available\n";
    private static final String SUCCESSFUL_MOVIE_CHECKOUT = "Thank you! Enjoy the movie\n";
    private static final String UNSUCCESSFUL_MOVIE_CHECKOUT = "Sorry, that movie is not available\n";
    private static final String SUCCESSFUL_RETURN = "Thank you for returning the book\n";
    private static final String UNSUCCESSFUL_RETURN = "That is not a valid book to return\n";
    private static final String GOODBYE = "Bye!";


    public static void firstGreeting() {
        System.out.println(GREETING);
    }

    public static void displayMainMenu() {
        System.out.println(Menu.MAIN);
    }

    public static void askForUserId() {
        System.out.println(Menu.LOG_IN_USER_ID);
    }

    public static void wrongUserId() {
        System.out.println(WRONG_USER_ID);
    }

    public static void askForPassword() {
        System.out.println(Menu.LOG_IN_USER_PASSWORD);
    }

    public static void wrongPassword() {
        System.out.println(WRONG_PASSWORD);
    }
    public static void displayUserMenu() {
        System.out.println(Menu.USER);
    }

    public static void displayListOfBooks() {
        System.out.println(BookManager.bookListAsString());
    }

    public static void displayListOfMovies() {
        System.out.println(MovieManager.movieListAsString());
    }

    public static void checkOutBook(Boolean checkOutSuccess) {
        if (checkOutSuccess) {
            System.out.println(SUCCESSFUL_BOOK_CHECKOUT);
        } else {
            System.out.println(UNSUCCESSFUL_BOOK_CHECKOUT);
        }
    }

    public static void returnBook(Boolean returnSuccess) {
        if (returnSuccess) {
            System.out.println(SUCCESSFUL_RETURN);
        } else {
            System.out.println(UNSUCCESSFUL_RETURN);
        }
    }

    public static void checkOutMovie(Boolean checkOutSuccess) {
        if (checkOutSuccess) {
            System.out.println(SUCCESSFUL_MOVIE_CHECKOUT);
        } else {
            System.out.println(UNSUCCESSFUL_MOVIE_CHECKOUT);
        }
    }

    public static void wrongInput() {
        System.out.println(WRONG_INPUT);
    }

    public static void goodbyeMessage() {
        System.out.println(GOODBYE);
    }
}
