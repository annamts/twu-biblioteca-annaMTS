package com.twu.biblioteca;

import java.util.Scanner;

public class UI {
    private static final String GREETING = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n";
    private static final String GOODBYE = "Bye!";

    Menu menu;
    Scanner scanner;

    public UI() {
        this.menu = new Menu();
        this.scanner = new Scanner(System.in);
    }

    public void startUI() {
        firstGreeting();
        String input = "m";
        while (thereIsNextMenu(input)) {
            displayNextMenu(input);
            displayOtherMenuOptions();
            input = getUserInput();
        }
        goodbyeMessage();
    }

    public void firstGreeting() {
        System.out.println(GREETING);
    }

    public void goodbyeMessage() {
        System.out.println(GOODBYE);
    }

    public void displayNextMenu(String input) {
        System.out.println(menu.next(input));
    }

    public Boolean thereIsNextMenu(String input) {
        return menu.next(input) != null;
    }

    public void displayOtherMenuOptions() {
        System.out.println(menu.quitOption());
    }

    public String getUserInput() {
        return scanner.nextLine();
    }
}
