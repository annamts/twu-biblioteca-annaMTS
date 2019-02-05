package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class UITest {

    private User user;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpUser() {
        user = new User("testUser", "testPass");
    }

    @Before
    public void setUpManagers() {
        BookManager.addBookList("test_resources/books.txt");
        MovieManager.addMovieList("test_resources/movies.txt");
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @After
    public void resetUser() {
        UI.setUser(Users.NO_USER);
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
                "Follow it by a space and the title or name of the resource if you want to check it out.\n" +
                "\n" +
                "\tb\tList of books\n" +
                "\tm\tList of movies\n" +
                "\tcm\tCheck out a movie\n" +
                "\tl\tLog in\n" +
                "\tq\tQuit application\n";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void listOfBooksIsDisplayedWhenInputIsB() {
        UI.respondToInput("b");
        assertEquals(BookManager.bookListAsString() + "\n", outContent.toString());
    }

    @Test
    public void userGetsNotifiedWhenChoosingAnInvalidOption() {
        UI.respondToInput("lalala");
        assertEquals("Please select a valid option!\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsLoggedInAndChecksOutBookTheyGetSuccessMessage() {
        UI.setUser(user);
        UI.respondToInput("cb Lolita");
        assertEquals("Thank you! Enjoy the book\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsNotLoggedInAndTriesToCheckOutBookTheyGetNotified() {
        UI.respondToInput("cb Lolita");
        assertEquals("Your need to log in!\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsLoggedInAndTriesToCheckOutBookThatDoesntExistTheyGetNotified() {
        UI.setUser(user);
        UI.respondToInput("cb blblbl");
        assertEquals("Sorry, that book is not available\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsNotLoggedInAndTriesToReturnABookTheyGetNotified() {
        UI.respondToInput("r Lolita");
        assertEquals("Your need to log in!\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsLoggedInAndTriesToReturnBookThatTheyDidNotCheckOutTheyAreNotified() {
        UI.setUser(user);
        UI.respondToInput("r Lolita");
        assertEquals("That is not a valid book to return\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsLoggedInAndReturnsBookThatTheyHaveTheyGetSuccessMessage() {
        UI.setUser(user);
        BookManager.checkOut("Lolita");
        UI.respondToInput("r Lolita");
        assertEquals("Thank you for returning the book\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsLoggedInAndReturnsBookThatIsCheckedOutButNotByThemTheyAreNotified() {
        BookManager.checkOut("Lolita");
        UI.setUser(user);
        UI.respondToInput("r Lolita");
        assertEquals("That is not a valid book to return\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsLoggedInAndReturnsBookThatIsNotCheckedOutTheyAreNotified() {
        UI.setUser(user);
        UI.respondToInput("r Lolita");
        assertEquals("That is not a valid book to return\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsLoggedInAndTriesToReturnBookThatDoesntExistTheyGetNotified() {
        UI.setUser(user);
        UI.respondToInput("r jhdga");
        assertEquals("That is not a valid book to return\n\n", outContent.toString());
    }

    @Test
    public void listOfMoviesIsDisplayedWhenInputIsM() {
        UI.respondToInput("m");
        assertEquals(MovieManager.movieListAsString() + "\n", outContent.toString());
    }

    @Test
    public void whenUserTriesToCheckOutAvailableMovieTheyGetSuccessMessage() {
        UI.respondToInput("cm Pulp Fiction");
        assertEquals("Thank you! Enjoy the movie\n\n", outContent.toString());
    }

    @Test
    public void whenUserTriesToCheckOutUnavailableMovieTheyAreNotified() {
        UI.respondToInput("cm blabla");
        assertEquals("Sorry, that movie is not available\n\n", outContent.toString());
    }
}