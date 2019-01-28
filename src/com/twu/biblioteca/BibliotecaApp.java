package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        UI ui = new UI();
        ui.firstGreeting();
        MainMenu menu = new MainMenu();
        ui.interactWithMenu(menu);
    }
}
