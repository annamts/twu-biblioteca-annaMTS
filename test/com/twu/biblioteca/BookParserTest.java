package com.twu.biblioteca;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookParserTest {
    @Test
    public void bookParserCanCreateABookObjectFromAString() {
        Book book = BookParser.createBook("A book,, An author,, 3019");
        assertEquals("A book", book.getTitle());
        assertEquals("An author", book.getAuthor());
        assertEquals((Integer)3019, book.getYearOfPublishing());
    }

    @Test
    public void bookParserCreatesListOfBooks() {
        List<Book> bookList = BookParser.createListOfBooks("test_resources/books.txt");
        assertEquals("In Search of Lost Time", bookList.get(0).getTitle());
    }
}