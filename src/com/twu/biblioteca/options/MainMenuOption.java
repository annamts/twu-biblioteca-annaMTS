package com.twu.biblioteca.options;

import com.twu.biblioteca.UI;

public class MainMenuOption extends Option {

    public MainMenuOption() {
        super("m", "Main menu");
    }

    public void action() {
        UI.mainMenuInteraction();
    }
}
