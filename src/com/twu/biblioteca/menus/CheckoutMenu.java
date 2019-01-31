package com.twu.biblioteca.menus;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.options.CheckoutBookOption;

public class CheckoutMenu extends MoveBookMenu {
    public CheckoutMenu() {
        super("Input the title of the book you wish to check out");
    }

    public void addBookOption(Book book) {
        this.addOption(new CheckoutBookOption(book));
    }
}
