package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainMenuTest {
    private MainMenu mainMenu;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpMainMenu() {
        mainMenu = new MainMenu();
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
    public void mainMenuIsDisplayed() {
        mainMenu.display();
        assertEquals("Please select one of the following options by inputting the number at the beginning of the line:\n" +
                "\n" +
                "\t1     List of books\n", outContent.toString());
    }

    @Test
    public void selectingOptionOnePrintsListOfBooks() {
        mainMenu.selectOption(1);
        assertEquals("These are our available books:\n\n\n" , outContent.toString());
    }
}