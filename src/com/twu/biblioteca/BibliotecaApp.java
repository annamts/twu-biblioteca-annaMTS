package com.twu.biblioteca;

import java.sql.SQLOutput;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n");
        System.out.println("These are our available books:\n");
        String bookList = "In Search of Lost Time by Marcel Proust\n" +
                            "Don Quixote by Miguel de Cervantes\n" +
                            "Ulysses by James Joyce\n" +
                            "The Great Gatsby by F. Scott Fitzgerald\n" +
                            "Moby Dick by Herman Melville\n" +
                            "Hamlet by William Shakespeare\n" +
                            "War and Peace by Leo Tolstoy\n" +
                            "The Odyssey by Homer\n" +
                            "One Hundred Years of Solitude by Gabriel Garcia Marquez\n" +
                            "The Divine Comedy by Dante Alighieri\n" +
                            "The Brothers Karamazov by Fyodor Dostoyevsky\n" +
                            "Madame Bovary by Gustave Flaubert\n" +
                            "The Adventures of Huckleberry Finn by Mark Twain\n" +
                            "The Iliad by Homer\n" +
                            "Lolita by Vladimir Nabokov\n";
        System.out.println(bookList);
    }
}
