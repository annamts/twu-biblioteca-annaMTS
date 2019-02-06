package com.twu.biblioteca;

import java.util.List;

public class BookManager extends ResourceManager {

    public BookManager(String fileName) {
        super("books");
        addBookList(fileName);
    }

    public void addBookList(String fileName) {
        List<Resource> listOfBooks = BookParser.createListOfBooks(fileName);
        super.setResourceList(listOfBooks);
    }

    public String listOfCheckedOutBooksAsString() {
        String result = "These are the checked out books:\n";
        for(Resource resource : super.getResourceList()) {
            Book book = (Book) resource;
            if (!book.isAvailable()) {
                result += "\n" + book.toFormattedStringWithUser();
            }
        }
        return result;
    }

    public Book findBook(String bookTitle) {
        return (Book)super.findResource(bookTitle);
    }

    public boolean returnBook(String bookTitle) {
        Book book = findBook(bookTitle);
        if (book == null || book.getUser() != UI.getUser()) {
            return false;
        } else {
            book.returnBook();
            return true;
        }
    }
}
