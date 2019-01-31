package com.twu.biblioteca.menus;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.options.ReturnBookOption;

public class ReturnMenu extends MoveBookMenu {
    public ReturnMenu() {
        super("Input the title of the book you wish to return");
    }

    public void addBookOption(Book book) {
        this.addOption(new ReturnBookOption(book));
    }
}
