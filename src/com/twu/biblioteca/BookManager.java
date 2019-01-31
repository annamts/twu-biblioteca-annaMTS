package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static List<Book> bookList;

    public static void addBookList(String fileName) {
        bookList = BookParser.createListOfBooks(fileName);
    }

    public static String bookListAsString() {
        String result = "These are our available books:\n";
        for (Book book : bookList) {
            if (book.isAvailable()){
                result += "\n" + book.toFormattedString();
            }
        }
        return result;
    }

    public static List<Book> getBookList() {
        return bookList;
    }

    public static Book findBook(String bookTitle) {
        for(Book book : bookList) {
            if (bookTitle.toLowerCase().equals(book.getTitle().toLowerCase())) {
                return book;
            }
        }
        return null;
    }

    public static Boolean checkOut(String bookTitle) {
        Book book = findBook(bookTitle);
        if (book != null && book.isAvailable()) {
            book.checkOut();
            return true;
        }
        return false;
    }

    public static boolean returnBook(String bookTitle) {
        Book book = findBook(bookTitle);
        if (book == null || book.isAvailable()) {
            return false;
        } else {
            book.returnBook();
            return true;
        }
    }
}
