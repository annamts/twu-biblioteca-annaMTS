package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UI ui = new UI();
        ui.firstGreeting();
        List<Book> bookList = BookParser.createListOfBooks("resources/books.txt");
        MainMenu mainMenu = new MainMenu();
        BookListMenu bookListMenu = (BookListMenu)mainMenu.getOptions().get(1).getAction();
        bookListMenu.addBookList(bookList);
        mainMenu.display();
        Integer input = Integer.parseInt(scanner.nextLine());
        mainMenu.selectOption(input);
    }
}
