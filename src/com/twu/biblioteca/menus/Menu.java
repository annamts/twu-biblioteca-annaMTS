package com.twu.biblioteca;

import com.twu.biblioteca.options.Option;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu {
    private String info;
    private List<Option> options;

    public Menu(String info) {
        this.info = info;
        this.options = new ArrayList<>();
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public String toString() {
        String result = info + "\n";
        for(Option option : options) {
            result += "\n" + option.toString();
        }
        return result;
    }

    public Option findOption(String input) {
        for (Option option : options) {
            if (option.getShortcut().equals(input)) {
                return option;
            }
        }
        return null;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public List<Option> getOptions() {
        return options;
    }
}
