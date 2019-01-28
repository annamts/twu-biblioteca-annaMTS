package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class UI {
    private static final String GREETING = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n";
    Scanner scanner;

    public UI() {
        this.scanner = new Scanner(System.in);
    }


    public void firstGreeting() {
        System.out.println(GREETING);
    }

    public void displayBooks() {
        for (Book book : BookManager.getBookList()) {
            System.out.println(book.toFormattedString());
        }
    }

}
