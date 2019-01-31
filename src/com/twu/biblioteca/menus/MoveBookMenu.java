package com.twu.biblioteca.menus;

import com.twu.biblioteca.*;
import com.twu.biblioteca.options.*;

public abstract class MoveBookMenu extends Menu {
    public MoveBookMenu(String info) {
        super(info);
        this.addOption(new MainMenuOption());
        this.addOption(new QuitOption());
        for (Book book : BookManager.getBookList()) {
            addBookOption(book);
        }
    }

    public String toString() {
        String result = this.getInfo() + "\n";
        for(Option option : this.getOptions()) {
            if(!(option instanceof CheckoutBookOption || option instanceof ReturnBookOption)) {
                result += "\n" + option.toString();
            }
        }
        return result;
    }

    public abstract void addBookOption(Book book);
}
