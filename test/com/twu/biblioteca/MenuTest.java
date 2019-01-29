package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MenuTest {
    Menu menu;

    @Before
    public void setUpMenu() {
        BookManager.addBookList("test_resources/books.txt");
        menu = new Menu();
    }

    @Test
    public void errorMessageIsIssuedWhenInvalidOptionIsChosen() {
        assertEquals("Please select a valid option!", menu.next("bdhjag"));
    }

    @Test
    public void nullIsReturnedWhenUserInputIsQForQuit() {
        assertEquals(null, menu.next("q"));
    }

    @Test
    public void checkOutReturnsSuccessMessageWhenBookIsCheckedOut() {
        assertEquals("The book 'Lolita' has been checked out", menu.checkOutBook("Lolita"));
    }

    @Test
    public void checkOutReturnsErrorMessageWhenBookWasNotCheckedOut() {
        assertEquals("'Blablabla' was not found", menu.checkOutBook("Blablabla"));
    }
}