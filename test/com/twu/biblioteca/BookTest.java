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
    public void bookObjectIsCreated() {
        assertEquals("The Blabla Book", book.getTitle());
        assertEquals("Important Person", book.getAuthor());
        assertEquals((Integer)2025, book.getYearOfPublishing());
    }

    @Test
    public void bookIsTurnedIntoFormattedString() {
        assertEquals("The Blabla Book                         Important Person         2025                          ", book.toString());
    }
}