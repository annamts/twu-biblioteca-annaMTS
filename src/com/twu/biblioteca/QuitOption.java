package com.twu.biblioteca;

public class QuitOption extends Option{
    public QuitOption() {
        super("q", "Quit application");
    }

    public void action() {
        UI.goodbyeMessage();
    }
}
