package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MenuOptionTest {
    MenuOption mo;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Before
    public void setUpMenuOption() {
        mo = new MenuOption(1,"name", new MainMenu());
    }

    @Test
    public void menuOPtionHasAName() {
        assertEquals("name", mo.getName());
    }

    @Test
    public void menuOptionHasAnActionThatInstantiatesAnotherMenu() {
        assertTrue(mo.getAction() instanceof MainMenu);
    }

    @Test
    public void menuOptionIsDisplayed() {
        String output = "\t1     name\n";
        mo.display();
        assertEquals(output, outContent.toString());
    }
}