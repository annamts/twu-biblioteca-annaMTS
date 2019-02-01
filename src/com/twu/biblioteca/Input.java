package com.twu.biblioteca;

import java.util.Scanner;

public class Input {
    public static final String LIST = "l";
    public static final String CHECK_OUT = "c";
    public static final String RETURN = "r";
    public static final String QUIT = "q";

    private static Scanner scanner = new Scanner(System.in);

    public static String get() {
        return scanner.nextLine();
    }

    public static String getFirstLetter(String input) {
        return input.split(" ")[0];
    }

    public static String extractBookTitle(String input) {
        try {
            return input.substring(2);
        } catch (StringIndexOutOfBoundsException e){
            return "";
        }
    }
}
