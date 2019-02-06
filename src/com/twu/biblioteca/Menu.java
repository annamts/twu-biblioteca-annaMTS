package com.twu.biblioteca;

public class Menu {
    public static final String MAIN =   "Choose an option by inputting the letter on the left.\n" +
                                        "Follow it by a space and the title or name of the resource if you want to check it out or return it.\n\n" +
                                        "\t" + Input.BOOK_LIST + "\tList of books\n" +
                                        "\t" + Input.MOVIE_LIST + "\tList of movies\n" +
                                        "\t" + Input.CHECK_OUT_MOVIE + "\tCheck out a movie\n" +
                                        "\t" + Input.LOG_IN + "\tLog in\n" +
                                        "\t" + Input.QUIT + "\tQuit application";
    public static final String USER =  "Choose an option by inputting the letter on the left.\n" +
                                        "Follow it by a space and the title or name of the resource if you want to check it out or return it.\n\n" +
                                        "\t" + Input.BOOK_LIST + "\tList of books\n" +
                                        "\t" + Input.MOVIE_LIST + "\tList of movies\n" +
                                        "\t" + Input.CHECK_OUT_MOVIE + "\tCheck out a movie\n" +
                                        "\t" + Input.CHECK_OUT_BOOK + "\tCheck out a book\n" +
                                        "\t" + Input.RETURN + "\tReturn a book\n" +
                                        "\t" + Input.USER_INFO + "\tMy personal information\n" +
                                        "\t" + Input.QUIT + "\tQuit application";
    public static final String LOG_IN_USER_ID = "Enter your user id";
    public static final String LOG_IN_USER_PASSWORD = "Enter your password";
}
