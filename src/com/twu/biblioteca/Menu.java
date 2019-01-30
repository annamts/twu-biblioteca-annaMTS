package com.twu.biblioteca;

public class Menu {

    public String next(String input) {
        switch(input) {
            case "m":
                return mainMenu();
            case "l":
                return listOfBooks();
            case "c":
                return checkOutMenu();
            case "q":
                return null;
//            default:
//                return "Please select a valid option!";
        }
        return checkOutBook(input);
    }

    public String listOfBooks() {
        String result = "These are our available books:\n\n";
        for (Book book : BookManager.getBookList()) {
            if (book.isAvailable()){
                result += book.toFormattedString() + "\n";
            }
        }
        return result;
    }

    public String mainMenu() {
        return "Select from the following options by inputting the letter on the left:\n" +
                "\n\tl\tList of books" +
                "\n\tc\tCheck out a book";
    }

    public String quitOption() {
        return "\tq\tQuit application";
    }

    public String mainMenuOption() {
        return "\tm\tMain menu";
    }

    public String checkOutMenu() {
        return listOfBooks() + "\nInput the title of the book you wish to check out\n";
    }

    public String checkOutBook(String bookTitle) {
        if(BookManager.checkOut(bookTitle)) {
            return "Thank you! Enjoy the book";
        } else {
            return "Please select a valid option!";
        }
    }
}
