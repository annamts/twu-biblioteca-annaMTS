package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<String, String> options;

    public Menu() {
        options = new HashMap<>();
        options.put("m", mainMenu());
        options.put("l", listOfBooks());
        options.put("q", null);
    }

    public String next(String input) {
        return options.containsKey(input)? options.get(input) : "Please select a valid option!";
    }

    public String listOfBooks() {
        String result = "These are our available books:\n\n";
        for (Book book : BookManager.getBookList()) {
            result += book.toFormattedString() + "\n";
        }
        result += "\nCheck out book by inputting its title\n";
        return result;
    }

    public String mainMenu() {
        return "Select from the following options by inputting the letter on the left:\n\n\tl\tList of books";
    }

    public String quitOption() {
        return "\tq\tQuit application";
    }

    public String mainMenuOption() {
        return "\tm\tMain menu";
    }

    public String checkOutBook(String bookTitle) {
        return BookManager.checkOut(bookTitle)? "The book '" + bookTitle + "' has been checked out" : "'" + bookTitle + "' was not found";
    }
}
