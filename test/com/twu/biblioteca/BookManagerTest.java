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
    public void listOfBooksIsNotModifiedWhenBookIsNotFound() {
        BookManager.checkOut("Blablabla");
        assertEquals(15, BookManager.getBookList().size());
    }

    @Test
    public void bookObjectIsFoundByTitle() {
        assertEquals("Lolita", BookManager.findBook("Lolita").getTitle());
    }

    @Test
    public void tryingToFindBookThatIsNotInTheListReturnsNull() {
        assertEquals(null, BookManager.findBook("bla"));
    }

    @Test
    public void checkOutReturnsTrueWhenBookIsFound() {
        assertTrue(BookManager.checkOut("Lolita"));
    }

    @Test
    public void checkOutReturnsFalseWhenBookIsNotFound() {
        assertFalse(BookManager.checkOut("Blablabla"));
    }

    @Test
    public void bookIsCheckedOutWhenItIsFound() {
        BookManager.checkOut("Lolita");
        assertEquals(false, BookManager.findBook("Lolita").isAvailable());
    }

}