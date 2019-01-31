package com.twu.biblioteca;

import java.util.Scanner;

public class UI {
    private static final String GREETING = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n";
    private static final String GOODBYE = "Bye!";
    private static final String WRONG_INPUT = "Please select a valid option!";

    private static Scanner scanner = new Scanner(System.in);
    private static Menu main = new MainMenu();
    private static Menu listOfBooks = new ListMenu();
    private static Menu checkout = new CheckoutMenu();

    public static void startUI() {
        System.out.println(GREETING);
        mainMenuInteraction();
    }

    public static String getUserInput() {
        return scanner.nextLine();
    }

    public static void interact(Menu menu) {
        System.out.println(menu.toString());
        nextAction(menu);
    }

    public static void nextAction(Menu menu) {
        Option option = menu.findOption(getUserInput());
        if(option == null) {
            wrongInput();
            nextAction(menu);
        } else {
            option.action();
        }
    }

    public static void mainMenuInteraction() {
        interact(main);
    }

    public static void listOfBooksInteraction() {
        listOfBooks.setInfo(BookManager.bookListAsString());
        interact(listOfBooks);
    }

    public static void checkOutABookInteraction() {
        interact(checkout);
    }


    public static void wrongInput() {
        System.out.println(WRONG_INPUT);
    }

    public static void firstGreeting() {
        System.out.println(GREETING);
    }

    public static void goodbyeMessage() {
        System.out.println(GOODBYE);
    }
}
