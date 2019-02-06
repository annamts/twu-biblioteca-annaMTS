package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookManagerTest {

    BookManager bookManager;

    @Before
    public void setUp() {
        bookManager = new BookManager("test_resources/books.txt");
    }

    @Test
    public void bookListIsAdded() {
        assertEquals(15, bookManager.getResourceList().size());
    }

    @Test
    public void listOfBooksIsNotModifiedWhenBookIsNotFound() {
        bookManager.checkOut("Blablabla");
        assertEquals(15, bookManager.getResourceList().size());
    }

    @Test
    public void bookObjectIsFoundByTitle() {
        assertEquals("Lolita", bookManager.findBook("Lolita").getTitle());
    }

    @Test
    public void tryingToFindBookThatIsNotInTheListReturnsNull() {
        assertEquals(null, bookManager.findBook("bla"));
    }

    @Test
    public void checkOutReturnsTrueWhenBookIsFound() {
        assertTrue(bookManager.checkOut("Lolita"));
    }

    @Test
    public void checkOutReturnsFalseWhenBookIsNotFound() {
        assertFalse(bookManager.checkOut("Blablabla"));
    }

    @Test
    public void bookIsCheckedOutWhenItIsFound() {
        bookManager.checkOut("Lolita");
        assertFalse(bookManager.findBook("Lolita").isAvailable());
    }

    @Test
    public void returnBookReturnsTrueWhenBookIsSuccessfullyReturned() {
        bookManager.checkOut("Lolita");
        assertTrue(bookManager.returnBook("Lolita"));
    }

    @Test
    public void returnBookReturnsFalseWhenBookIsAlreadyThere() {
        assertFalse(bookManager.returnBook("Lolita"));
    }

    @Test
    public void returnBookReturnsFalseWhenBookIsNotInBooklist() {
        assertFalse(bookManager.returnBook("bla"));
    }

}