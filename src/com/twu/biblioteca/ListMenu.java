package com.twu.biblioteca;

public class ListMenu extends Menu{
    public ListMenu() {
        super(BookManager.bookListAsString());
        this.addOption(new MainMenuOption());
        this.addOption(new QuitOption());
    }
}
