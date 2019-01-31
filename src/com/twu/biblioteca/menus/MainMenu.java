package com.twu.biblioteca;

import com.twu.biblioteca.options.CheckOutOption;
import com.twu.biblioteca.options.ListOption;

public class MainMenu extends Menu{
    public MainMenu() {
        super("Select from the following options by inputting the letter on the left:");
        this.addOption(new ListOption());
        this.addOption(new CheckOutOption());
        this.addOption(new QuitOption());
    }
}
