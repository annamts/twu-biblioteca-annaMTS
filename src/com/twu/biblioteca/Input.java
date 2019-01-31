package com.twu.biblioteca;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getUserInput() {
        return scanner.nextLine();
    }

    public static String getFirstLetterOfInput(String input) {
        return input.split(" ")[0];
    }

    public static String extractBookTitle(String input) {
        return input.substring(2);
    }
}
