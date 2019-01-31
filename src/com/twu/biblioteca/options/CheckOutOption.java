package com.twu.biblioteca;

public class CheckOutOption extends Option {
    public CheckOutOption() {
        super("c", "Check out a book");
    }

    public void action() {
        UI.checkOutABookInteraction();
    }
}
