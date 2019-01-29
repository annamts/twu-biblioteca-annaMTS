package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<String, String> options;

    public Menu() {
        options = new HashMap<>();
        options.put("m", mainMenu());
        options.put("l", listOfBooks());
    }

    public String next(String input) {
        return options.containsKey(input)? options.get(input) : "Please select a valid option!";
    }

    public String listOfBooks() {
        String result = "";
        for (Book book : BookManager.getBookList()) {
            result += book.toFormattedString() + "\n";
        }
        return result;
    }

    public String mainMenu() {
        return "Select from the following options by inputting the letter on the left:\n\n\tl\tList of books";
    }
}
