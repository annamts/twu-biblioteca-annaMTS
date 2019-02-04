package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BookManager.addBookList("resources/books.txt");
        UI.startUI();
    }
}