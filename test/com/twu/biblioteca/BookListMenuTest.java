package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookListMenuTest {
    private BookListMenu bookListMenu;
    private List<Book> bookList;

    @Before
    public void setUpBookListMenu() {
        bookList = BookParser.createListOfBooks("test_resources/books.txt");
        bookListMenu = new BookListMenu();
    }

    @Test
    public void listOfBooksIsAdded() {
        bookListMenu.addBookList(bookList);
        assertEquals("In Search of Lost Time                  Marcel Proust            1913                          ", bookListMenu.getOptions().get(1).getName());
    }
}