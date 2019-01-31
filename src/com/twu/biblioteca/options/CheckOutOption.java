package com.twu.biblioteca.options;

import com.twu.biblioteca.UI;

public class CheckOutOption extends Option {
    public CheckOutOption() {
        super("c", "Check out a book");
    }

    public void action() {
        UI.checkOutABookInteraction();
    }
}
