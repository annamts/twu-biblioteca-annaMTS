package com.twu.biblioteca;

public abstract class Option {
    private String shortcut;
    private String name;

    public Option(String shortcut, String name) {
        this.shortcut = shortcut;
        this.name = name;
    }

    public abstract void action();

    public String toString() {
        return "\t" + shortcut + "\t" + name;
    }

    public String getShortcut() {
        return shortcut;
    }
}
