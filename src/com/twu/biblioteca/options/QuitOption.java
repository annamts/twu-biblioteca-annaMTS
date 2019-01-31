package com.twu.biblioteca;

import com.twu.biblioteca.options.Option;

public class QuitOption extends Option {
    public QuitOption() {
        super("q", "Quit application");
    }

    public void action() {
        UI.goodbyeMessage();
    }
}
