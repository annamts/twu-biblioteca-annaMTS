package com.twu.biblioteca;

public class ListOption extends Option{
    public ListOption() {
        super("l", "List of books");
    }

    public void action() {
        UI.listOfBooksInteraction();
    }
}
