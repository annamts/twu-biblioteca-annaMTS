package com.twu.biblioteca;

import java.util.List;

public class Greeting {
    private static final String GREETING = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n";
    private static final String INTRODUCE_BOOK_LIST = "These are our available books:\n";

    public static void firstGreeting() {
        System.out.println(GREETING);
    }

    public static void printAvailableBooks(List<Book> bookList) {
        System.out.println(INTRODUCE_BOOK_LIST);
        for(Book i : bookList) {
            System.out.println(i.toString());
        }
    }
}
