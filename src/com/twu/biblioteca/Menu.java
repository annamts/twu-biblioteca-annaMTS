package com.twu.biblioteca;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Menu {
    private Map<Integer, MenuOption> options;
    private String startLine;

    public Menu(String startLine) {
        options = new LinkedHashMap<>();
        this.startLine = startLine;
    }

    public void display() {
        String result = startLine;
        for(Integer key : options.keySet()) {
            String option = options.get(key).getName();
            result += "\n\t" + String.format("%-5d", key) + " " + option;
        }
        System.out.println(result);
    }

    public Menu followingMenu(Integer input) {
        if (options.containsKey(input)) {
            return options.get(input).getAction();
        } else {
            System.out.println("Please select a valid option!");
            return this;
        }
    }

    public Map<Integer, MenuOption> getOptions() {
        return options;
    }

}
