package com.twu.biblioteca;

import java.util.List;

public class BookListMenu extends Menu{

    public BookListMenu() {

        super("These are our available books:\n\n");
        addBookList();
    }

    public void addBookList() {
        List<Book> bookList = BookParser.createListOfBooks("resources/books.txt");
        Integer counter = 1;
        for(Book book: bookList) {
            this.getOptions().add(new MenuOption(counter, book.toString(), null));
            counter++;
        }
    }
}
