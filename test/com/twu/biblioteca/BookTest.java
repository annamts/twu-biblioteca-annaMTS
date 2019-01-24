package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void bookObjectIsCreated() {
        Book book = new Book("The Blabla Book", "Important Person", 2025);
        assertEquals("The Blabla Book", book.getTitle());
    }
}