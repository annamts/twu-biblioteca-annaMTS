package com.twu.biblioteca;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class MainMenu extends Menu {

    public MainMenu() {
        super("Select one of the following options by inputting the number at the beginning of the line:\n");
        this.getOptions().put(1, new MenuOption("List of books", new BookListMenu()));
    }
}
