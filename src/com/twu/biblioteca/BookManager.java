package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static List<Book> bookList;

    public static void addBookList(String fileName) {
        bookList = BookParser.createListOfBooks(fileName);
    }

    public static List<Book> getBookList() {
        return bookList;
    }

    public static Boolean checkOut(String bookTitle) {
        for(Book book : bookList) {
            if (bookTitle.equals(book.getTitle())) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }
}
