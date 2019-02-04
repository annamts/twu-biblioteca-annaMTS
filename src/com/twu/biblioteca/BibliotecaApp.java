package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BookManager.addBookList("resources/books.txt");
        MovieManager.addMovieList("resources/movies.txt");
        UI.startUI();
    }
}