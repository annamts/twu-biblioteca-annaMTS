package com.twu.biblioteca;

public class UI {

    public static void startUI() {
        Output.firstGreeting();
        Output.displayMainMenu();
        String input = Input.getUserInput();
        while(!input.equals("q")) {
            respondToInput(input);
            input = Input.getUserInput();
        }
        Output.goodbyeMessage();
    }

    public static void respondToInput(String input) {
        switch(Input.getFirstLetterOfInput(input)) {
            case "l":
                Output.displayListOfBooks();
                break;
            case "c":
                if (BookManager.checkOut(Input.extractBookTitle(input))) {
                    Output.successfulCheckout();
                } else {
                    Output.unsuccessfulCheckout();
                }
                break;
            case "r":
                if (BookManager.returnBook(Input.extractBookTitle(input))) {
                    Output.successfulReturn();
                } else {
                    Output.unsuccessfulReturn();
                }
                break;
            default:
                Output.wrongInput();
        }
    }
}
