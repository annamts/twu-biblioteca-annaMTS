package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        BookManager.addBookList("resources/books.txt");
        UI ui = new UI();
        ui.firstGreeting();
        ui.displayBooks();
    }
}
