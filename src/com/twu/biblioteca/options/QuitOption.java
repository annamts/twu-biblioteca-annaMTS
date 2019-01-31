package com.twu.biblioteca.options;

import com.twu.biblioteca.UI;
import com.twu.biblioteca.options.Option;

public class QuitOption extends Option {
    public QuitOption() {
        super("q", "Quit application");
    }

    public void action() {
        UI.goodbyeMessage();
    }
}
