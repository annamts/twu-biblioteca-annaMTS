package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class UI {
    private static final String GREETING = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n";
    Menu menu;
    Scanner scanner;

    public UI() {
        this.menu = new Menu();
        this.scanner = new Scanner(System.in);
    }

    public void startUI() {
        firstGreeting();
        String input = "m";
        while (menu.next(input) != null) {
            displayNextMenu(input);
            input = getUserInput();
        }
    }

    public void firstGreeting() {
        System.out.println(GREETING);
    }


    public void displayNextMenu(String input) {
        System.out.println(menu.next(input));
    }

    public String getUserInput() {
        return scanner.nextLine();
    }
}
