package com.twu.biblioteca;

public class MenuOption {
    private String name;
    private Menu action;

    public MenuOption(String name, Menu action) {
        this.name = name;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public Menu getAction() {
        return action;
    }
}
