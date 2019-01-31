package com.twu.biblioteca.options;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.BookManager;
import com.twu.biblioteca.UI;

public class ReturnBookOption extends Option {
    private Book book;

    public ReturnBookOption(Book book) {
        super(book.getTitle(), book.getTitle());
        this.book = book;
    }

    public void action() {
        if(BookManager.returnBook(book.getTitle())) {
            System.out.println("Thank you for returning the book\n");
        } else {
            System.out.println("That is not a valid book return\n");
        }
        UI.mainMenuInteraction();
    }
}
