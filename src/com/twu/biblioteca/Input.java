package com.twu.biblioteca;

import java.util.Scanner;

public class Input {
    public static final String BOOK_LIST = "b";
    public static final String MOVIE_LIST = "m";
    public static final String CHECK_OUT_BOOK = "cb";
    public static final String CHECK_OUT_MOVIE = "cm";
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
            return input.substring(input.indexOf(" ") + 1);
        } catch (StringIndexOutOfBoundsException e){
            return "";
        }
    }
}
