package com.twu.biblioteca;

import java.util.List;

public class BookListMenu extends Menu{

    public BookListMenu() {
        super("These are our available books:\n\n");
    }

    public void addBookList(List<Book> bookList) {
        Integer counter = 1;
        for(Book book: bookList) {
            this.getOptions().put(counter, new MenuOption(book.toString(), null));
            counter++;
        }
    }
}