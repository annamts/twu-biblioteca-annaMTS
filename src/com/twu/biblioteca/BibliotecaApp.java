package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        UI ui = new UI();
        BookManager.addBookList("resources/books.txt");
        ui.startUI();
    }
}