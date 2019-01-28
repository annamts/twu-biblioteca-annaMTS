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
        String output = "Select one of the following options by inputting the number at the beginning of the line:\n" +
                "\n" +
                "\t1     List of books\n" +
                "\n" +
                "\t0     Quit application\n";
        assertEquals(output, outContent.toString());
    }

    @Test
    public void choosingInvalidOptionPrintsErrorMessage() {
        mainMenu.followingMenu(425);
        assertEquals("Please select a valid option!\n", outContent.toString());
    }
}