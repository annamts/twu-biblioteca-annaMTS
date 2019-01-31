package com.twu.biblioteca;

import com.twu.biblioteca.options.BookOption;
import com.twu.biblioteca.options.MainMenuOption;
import com.twu.biblioteca.options.Option;

public class CheckoutMenu extends Menu {
    public CheckoutMenu() {
        super("Input the title of the book you wish to check out");
        this.addOption(new MainMenuOption());
        this.addOption(new QuitOption());
        for (Book book : BookManager.getBookList()) {
            this.addOption(new BookOption(book));
        }
    }

    public String toString() {
        String result = this.getInfo() + "\n";
        for(Option option : this.getOptions()) {
            if(!(option instanceof BookOption)) {
                result += "\n" + option.toString();
            }
        }
        return result;
    }
}
