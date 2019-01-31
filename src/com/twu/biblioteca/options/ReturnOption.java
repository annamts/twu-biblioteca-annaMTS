package com.twu.biblioteca.options;

import com.twu.biblioteca.UI;

public class ReturnOption extends Option{
    public ReturnOption() {
        super("r", "Return a book");
    }

    public void action() {
        UI.returnABookInteraction();
    }
}
