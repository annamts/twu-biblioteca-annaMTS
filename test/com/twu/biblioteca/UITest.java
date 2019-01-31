package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class UITest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpUI() {
        BookManager.addBookList("test_resources/books.txt");
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void firstGreetingIsShown() {
        Output.firstGreeting();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n\n", outContent.toString());
    }

    @Test
    public void listOfBooksIsDisplayed() {
        Output.displayListOfBooks();
        assertEquals(BookManager.bookListAsString() + "\n", outContent.toString());
    }

    @Test
    public void mainMenuIsDisplayed() {
        Output.displayMainMenu();
        String expected = "Choose an option by inputting the letter on the left.\n" +
                "Follow it by a space and the title of the book if you are checking out or returning a book.\n\n" +
                "\tl\tList of books\n" +
                "\tc\tCheck out a book\n" +
                "\tr\tReturn a book\n" +
                "\tq\tQuit application";
        assertEquals(expected + "\n", outContent.toString());
    }

    @Test
    public void listOfBooksIsDisplayedWhenInputIsL() {
        UI.respondToInput("l");
        assertEquals(BookManager.bookListAsString() + "\n", outContent.toString());
    }

    @Test
    public void userGetsNotifiedWhenChoosingAnInvalidOption() {
        UI.respondToInput("lalala");
        assertEquals("Please select a valid option!\n", outContent.toString());
    }

    @Test
    public void whenUserChecksOutBookTheyGetSuccessMessage() {
        UI.respondToInput("c Lolita");
        assertEquals("Thank you! Enjoy the book\n", outContent.toString());
    }

    @Test
    public void whenUserTriesToCheckOutBookThatDoesntExistTheyGetNotified() {
        UI.respondToInput("c blblbl");
        assertEquals("Sorry, that book is not available\n", outContent.toString());
    }

    @Test
    public void whenUserReturnsBookTheyGetSuccessMessage() {
        BookManager.checkOut("Lolita");
        UI.respondToInput("r Lolita");
        assertEquals("Thank you for returning the book\n", outContent.toString());
    }

    @Test
    public void whenUserTriesToReturnBookThatIsAlreadyThereTheyAreNotified() {
        UI.respondToInput("r Lolita");
        assertEquals("That is not a valid book to return\n", outContent.toString());
    }

    @Test
    public void whenUserTriesToReturnBookThatDoesntExistTheyGetNotified() {
        UI.respondToInput("r jhdga");
        assertEquals("That is not a valid book to return\n", outContent.toString());
    }
}