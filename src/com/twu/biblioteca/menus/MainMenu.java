package com.twu.biblioteca.menus;

import com.twu.biblioteca.options.*;

public class MainMenu extends Menu{
    public MainMenu() {
        super("Select from the following options by inputting the letter on the left:");
        this.addOption(new ListOption());
        this.addOption(new CheckOutOption());
        this.addOption(new ReturnOption());
        this.addOption(new QuitOption());
    }
}
