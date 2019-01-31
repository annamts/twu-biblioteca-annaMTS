package com.twu.biblioteca;

public class MainMenu extends Menu{
    public MainMenu() {
        super("Select from the following options by inputting the letter on the left:");
        this.addOption(new ListOption());
        this.addOption(new CheckOutOption());
        this.addOption(new QuitOption());
    }
}
