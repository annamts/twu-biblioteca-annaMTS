package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    Book book;

    @Before
    public void setUp() {
        book = new Book("The Blabla Book", "Important Person", 2025);
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
}