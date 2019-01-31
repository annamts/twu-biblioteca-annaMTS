package com.twu.biblioteca;

public class Output {
    static final String GREETING = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n";
    static final String MAIN_MENU = "Choose an option by inputting the letter on the left.\n" +
                                    "Follow it by a space and the title of the book if you are checking out or returning a book.\n\n" +
                                    "\tl\tList of books\n" +
                                    "\tc\tCheck out a book\n" +
                                    "\tr\tReturn a book\n" +
                                    "\tq\tQuit application";
    static final String WRONG_INPUT = "Please select a valid option!";
    static final String SUCCESSFUL_CHECKOUT = "Thank you! Enjoy the book";
    static final String UNSUCCESSFUL_CHECKOUT = "Sorry, that book is not available";
    static final String SUCCESSFUL_RETURN = "Thank you for returning the book";
    static final String UNSUCCESSFUL_RETURN = "That is not a valid book to return";
    static final String GOODBYE = "Bye!";


    public static void firstGreeting() {
        System.out.println(GREETING);
    }

    public static void displayMainMenu() {
        System.out.println(MAIN_MENU);
    }

    public static void displayListOfBooks() {
        System.out.println(BookManager.bookListAsString());
    }

    public static void successfulCheckout() {
        System.out.println(SUCCESSFUL_CHECKOUT);
    }

    public static void unsuccessfulCheckout() {
        System.out.println(UNSUCCESSFUL_CHECKOUT);
    }

    public static void successfulReturn() {
        System.out.println(SUCCESSFUL_RETURN);
    }

    public static void unsuccessfulReturn() {
        System.out.println(UNSUCCESSFUL_RETURN);
    }

    public static void wrongInput() {
        System.out.println(WRONG_INPUT);
    }

    public static void goodbyeMessage() {
        System.out.println(GOODBYE);
    }
}
