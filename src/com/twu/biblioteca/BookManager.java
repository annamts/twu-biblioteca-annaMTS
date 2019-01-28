package com.twu.biblioteca;

import java.util.List;

public class BookManager {
    private static List<Book> bookList;

    public static void addBookList(String fileName) {
        bookList = BookParser.createListOfBooks(fileName);
    }

    public static List<Book> getBookList() {
        return bookList;
    }

    public static void checkOut(Book book) {
        bookList.remove(book);
    }
}
