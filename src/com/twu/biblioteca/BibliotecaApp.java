package com.twu.biblioteca;

import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        Greeting.firstGreeting();
        List<Book> bookList = BookParser.createListOfBooks("resources/books.txt");
        Greeting.printAvailableBooks(bookList);
    }
}
