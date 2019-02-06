package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class UITest {

    private User user;
    private BookManager bookManager;
    private MovieManager movieManager;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpUser() {
        user = new User("testUser", "testPass");
    }

    @Before
    public void setUpManagers() {
        bookManager = new BookManager("test_resources/books.txt");
        movieManager = new MovieManager("test_resources/movies.txt");
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
        assertEquals(bookManager.resourceListAsString() + "\n", outContent.toString());
    }

    @Test
    public void mainMenuIsDisplayed() {
        Output.displayMainMenu();
        String expected = "Choose an option by inputting the letter on the left.\n" +
                "Follow it by a space and the title or title of the resource if you want to check it out or return it.\n" +
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
        UI.setInput("b");
        UI.respondToInput();
        assertEquals(bookManager.resourceListAsString() + "\n", outContent.toString());
    }

    @Test
    public void userGetsNotifiedWhenChoosingAnInvalidOption() {
        UI.setInput("lalala");
        UI.respondToInput();
        assertEquals("Please select a valid option!\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsLoggedInAndChecksOutBookTheyGetSuccessMessage() {
        UI.setUser(user);
        UI.setInput("cb Lolita");
        UI.respondToInput();
        assertEquals("Thank you! Enjoy the book\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsNotLoggedInAndTriesToCheckOutBookTheyGetNotified() {
        UI.setInput("cb Lolita");
        UI.respondToInput();
        assertEquals("Your need to log in!\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsLoggedInAndTriesToCheckOutBookThatDoesntExistTheyGetNotified() {
        UI.setInput("cb blblbl");
        UI.setUser(user);
        UI.respondToInput();
        assertEquals("Sorry, that book is not available\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsNotLoggedInAndTriesToReturnABookTheyGetNotified() {
        UI.setInput("r Lolita");
        UI.respondToInput();
        assertEquals("Your need to log in!\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsLoggedInAndTriesToReturnBookThatTheyDidNotCheckOutTheyAreNotified() {
        UI.setUser(user);
        UI.setInput("r Lolita");
        UI.respondToInput();
        assertEquals("That is not a valid book to return\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsLoggedInAndReturnsBookThatTheyHaveTheyGetSuccessMessage() {
        UI.setUser(user);
        UI.setInput("cb Lolita");
        UI.respondToInput();
        UI.setInput("r Lolita");
        UI.respondToInput();
        assertEquals("Thank you! Enjoy the book\n\n" +
                "Thank you for returning the book\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsLoggedInAndReturnsBookThatIsCheckedOutButNotByThemTheyAreNotified() {
        bookManager.checkOut("Lolita");
        UI.setUser(user);
        UI.setInput("r Lolita");
        UI.respondToInput();
        assertEquals("That is not a valid book to return\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsLoggedInAndReturnsBookThatIsNotCheckedOutTheyAreNotified() {
        UI.setUser(user);
        UI.setInput("r Lolita");
        UI.respondToInput();
        assertEquals("That is not a valid book to return\n\n", outContent.toString());
    }

    @Test
    public void whenUserIsLoggedInAndTriesToReturnBookThatDoesntExistTheyGetNotified() {
        UI.setUser(user);
        UI.setInput("r jhdga");
        UI.respondToInput();
        assertEquals("That is not a valid book to return\n\n", outContent.toString());
    }

    @Test
    public void listOfMoviesIsDisplayedWhenInputIsM() {
        UI.setInput("m");
        UI.respondToInput();
        assertEquals(movieManager.resourceListAsString() + "\n", outContent.toString());
    }

    @Test
    public void whenUserTriesToCheckOutAvailableMovieTheyGetSuccessMessage() {
        UI.setInput("cm Pulp Fiction");
        UI.respondToInput();
        assertEquals("Thank you! Enjoy the movie\n\n", outContent.toString());
    }

    @Test
    public void whenUserTriesToCheckOutUnavailableMovieTheyAreNotified() {
        UI.setInput("cm blabla");
        UI.respondToInput();
        assertEquals("Sorry, that movie is not available\n\n", outContent.toString());
    }
}