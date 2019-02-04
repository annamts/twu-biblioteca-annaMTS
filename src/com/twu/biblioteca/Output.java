package com.twu.biblioteca;

public class Output {
    private static final String GREETING = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n";
    private static final String MAIN_MENU = "Choose an option by inputting the letter on the left.\n" +
                                    "Follow it by a space and the title of the book if you are checking out or returning a book.\n\n" +
                                    "\t" + Input.LIST + "\tList of books\n" +
                                    "\t" + Input.CHECK_OUT +"\tCheck out a book\n" +
                                    "\t" + Input.RETURN + "\tReturn a book\n" +
                                    "\t" + Input.QUIT + "\tQuit application";
    private static final String WRONG_INPUT = "Please select a valid option!\n";
    private static final String SUCCESSFUL_CHECKOUT = "Thank you! Enjoy the book\n";
    private static final String UNSUCCESSFUL_CHECKOUT = "Sorry, that book is not available\n";
    private static final String SUCCESSFUL_RETURN = "Thank you for returning the book\n";
    private static final String UNSUCCESSFUL_RETURN = "That is not a valid book to return\n";
    private static final String GOODBYE = "Bye!";


    public static void firstGreeting() {
        System.out.println(GREETING);
    }

    public static void displayMainMenu() {
        System.out.println(MAIN_MENU);
    }

    public static void displayListOfBooks() {
        System.out.println(BookManager.bookListAsString());
    }

    public static void checkOut(Boolean checkOutSuccess) {
        if (checkOutSuccess) {
            successfulCheckout();
        } else {
            unsuccessfulCheckout();;
        }
    }

    public static void successfulCheckout() {
        System.out.println(SUCCESSFUL_CHECKOUT);
    }

    public static void unsuccessfulCheckout() {
        System.out.println(UNSUCCESSFUL_CHECKOUT);
    }

    public static void returnBook(Boolean returnSuccess) {
        if (returnSuccess) {
            successfulReturn();
        } else {
            unsuccessfulReturn();
        }
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
