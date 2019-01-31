package com.twu.biblioteca.options;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.BookManager;
import com.twu.biblioteca.UI;

public class CheckoutBookOption extends Option{
    private Book book;

    public CheckoutBookOption(Book book) {
        super(book.getTitle(), book.getTitle());
        this.book = book;
    }

    public void action() {
        if(BookManager.checkOut(book.getTitle())) {
            System.out.println("Thank you! Enjoy the book\n");
        } else {
            System.out.println("Sorry, that book is not available\n");
        }
        UI.mainMenuInteraction();
    }
}
