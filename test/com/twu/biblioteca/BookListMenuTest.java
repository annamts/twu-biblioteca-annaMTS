package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookListMenuTest {
    private BookListMenu bookListMenu;

    @Before
    public void setUpBookListMenu() {
        BookManager.addBookList("test_resources/books.txt");
        bookListMenu = new BookListMenu();
    }

    @Test
    public void listOfBooksIsAdded() {
        assertEquals(16, bookListMenu.getOptions().size());
    }

    @Test
    public void sameMenuIsReturnedWhenInputingInvalidOption() {
        assertEquals(bookListMenu, bookListMenu.followingMenu(9876));
    }
}