package com.twu.biblioteca;

public class MainMenuOption extends Option {

    public MainMenuOption() {
        super("m", "Main menu");
    }

    public void action() {
        UI.mainMenuInteraction();
    }
}
