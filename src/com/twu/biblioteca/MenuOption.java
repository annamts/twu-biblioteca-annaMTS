package com.twu.biblioteca;

public class MenuOption {
    private Integer id;
    private String name;
    private Menu action;

    public MenuOption(Integer id, String name, Menu action) {
        this.id = id;
        this.name = name;
        this.action = action;
    }

    public void display() {
        System.out.println( "\t" + String.format("%-5d", this.id) + " " + this.name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Menu getAction() {
        return action;
    }
}
