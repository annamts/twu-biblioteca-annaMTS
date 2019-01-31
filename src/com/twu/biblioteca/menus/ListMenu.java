package com.twu.biblioteca;

import com.twu.biblioteca.options.MainMenuOption;

public class ListMenu extends Menu{
    public ListMenu() {
        super(BookManager.bookListAsString());
        this.addOption(new MainMenuOption());
        this.addOption(new QuitOption());
    }
}
