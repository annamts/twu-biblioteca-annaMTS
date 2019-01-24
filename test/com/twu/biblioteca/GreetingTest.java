package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.*;

public class GreetingTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void userGreetingIsPrinted(){
        Greeting.firstGreeting();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n\n", outContent.toString());
    }

    @Test
    public void availableBooksArePrinted(){
        String availableBooks = "These are our available books:\n" +
                "\n" +
                "In Search of Lost Time                  Marcel Proust            1913                          \n" +
                "Don Quixote                             Miguel de Cervantes      1605                          \n" +
                "Ulysses                                 James Joyce              1922                          \n" +
                "The Great Gatsby                        F. Scott Fitzgerald      1925                          \n" +
                "Moby Dick                               Herman Melville          1851                          \n" +
                "Hamlet                                  William Shakespeare      1602                          \n" +
                "War and Peace                           Leo Tolstoy              1869                          \n" +
                "One Hundred Years of Solitude           Gabriel Garcia Marquez   1967                          \n" +
                "The Divine Comedy                       Dante Alighieri          1320                          \n" +
                "The Brothers Karamazov                  Fyodor Dostoyevsky       1879                          \n" +
                "Madame Bovary                           Gustave Flaubert         1857                          \n" +
                "The Adventures of Huckleberry Finn      Mark Twain               1884                          \n" +
                "Lolita                                  Vladimir Nabokov         1955                          \n" +
                "Alice's Adventures in Wonderland        Lewis Carroll            1865                          \n" +
                "Wuthering Heights                       Emily Brontë             1847                          \n";

        List<Book> bookList = BookParser.createListOfBooks("test_resources/books.txt");
        Greeting.printAvailableBooks(bookList);
        assertEquals(availableBooks, outContent.toString());
    }
}