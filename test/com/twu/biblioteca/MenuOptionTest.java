package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MenuOptionTest {
    MenuOption mo;
    @Before
    public void setUpMenuOption() {
        mo = new MenuOption("name", new MainMenu());
    }

    @Test
    public void menuOPtionHasAName() {
        assertEquals("name", mo.getName());
    }

    @Test
    public void menuOptionHasAnActionThatInstantiatesAnotherMenu() {
        assertTrue(mo.getAction() instanceof MainMenu);
    }
}