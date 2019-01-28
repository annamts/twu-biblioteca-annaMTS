package com.twu.biblioteca;

import javax.swing.text.html.Option;
import java.util.*;

public abstract class Menu {
    private List<MenuOption> options;
    private String startLine;

    public Menu(String startLine) {
        options = new ArrayList<>();
        this.startLine = startLine;
        this.options.add(new MenuOption(0,"Quit application", null));
    }

    public void display() {
        System.out.println(startLine);
        for(Integer i = 1; i < options.size(); i++) {
            options.get(i).display();
        }
        System.out.println();
        options.get(0).display();
    }

    public Menu followingMenu(Integer input) {
        if (input <= options.size()) {
            return options.get(input).getAction();
        } else {
            System.out.println("Please select a valid option!");
            return this;
        }
    }

    public List<MenuOption> getOptions() {
        return options;
    }

}
