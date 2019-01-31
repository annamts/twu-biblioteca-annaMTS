package com.twu.biblioteca.options;

import com.twu.biblioteca.UI;

public class ListOption extends Option{
    public ListOption() {
        super("l", "List of books");
    }

    public void action() {
        UI.listOfBooksInteraction();
    }
}
