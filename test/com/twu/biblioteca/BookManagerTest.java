package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookManagerTest {

    @Before
    public void setUp() {
        BookManager.addBookList("test_resources/books.txt");
    }

    @Test
    public void bookListIsAdded() {
        assertEquals(15, BookManager.getBookList().size());
    }

    @Test
    public void bookIsCheckedOut() {
        Book book = BookManager.getBookList().get(3);
        BookManager.checkOut(book);
        assertEquals(14, BookManager.getBookList().size());
    }

}