package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    Book book;
    User user;

    @Before
    public void setUp() {
        book = new Book("The Blabla Book", "Important Person", 2025);
        user = new User("testId", "testPass");
    }

    @After
    public void resetUser() {
        UI.setUser(Users.NO_USER);
    }

    @Test
    public void bookIsTurnedIntoFormattedString() {
        assertEquals("The Blabla Book                          Important Person          2025                          ", book.toFormattedString());
    }

    @Test
    public void availableIsSetToFalseWhenBookIsCheckedOut() {
        book.checkOut();
        assertFalse(book.isAvailable());
    }

    @Test
    public void userIsSetToCurrentUserWhenBookIsCheckedOut() {
        UI.setUser(user);
        book.checkOut();
        assertEquals(user, book.getUser());
    }
}