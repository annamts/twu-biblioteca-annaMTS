package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class UI {

    private static User user = Users.NO_USER;
    private static String input = "";
    private static BookManager bookManager;
    private static MovieManager movieManager;
    private static final Map<String, Runnable> options;

    static {
        bookManager = new BookManager("resources/books.txt");
        movieManager = new MovieManager("resources/movies.txt");

        options = new HashMap<>();
        options.put(Input.BOOK_LIST, () -> Output.displayListOfBooks());
        options.put(Input.LOG_IN, () -> MenuActions.logIn());
        options.put(Input.MOVIE_LIST, () -> Output.displayListOfMovies());
        options.put(Input.CHECK_OUT_BOOK, () -> MenuActions.checkOutBook());
        options.put(Input.CHECK_OUT_MOVIE, () -> MenuActions.checkOutMovie());
        options.put(Input.RETURN, () -> MenuActions.returnBook());
        options.put(Input.USER_INFO, () -> MenuActions.showUserInfo());
    }

    public static void startUI() {
        Output.firstGreeting();
        Output.displayMainMenu();
        input = Input.get();
        while(!input.equals(Input.QUIT)) {
            respondToInput();
            if(user == Users.NO_USER) {
                Output.displayMainMenu();
            } else if (user.isSuperUser()) {
                Output.displayListOfCheckedOutBooks();
            } else {
                Output.displayUserMenu();
            }
            input = Input.get();
        }
        Output.goodbyeMessage();
    }

    public static void respondToInput() {
        String firstLetter = Input.getFirstLetter(input);
        if (options.containsKey(firstLetter)) {
            options.get(firstLetter).run();
        } else {
            Output.wrongInput();
        }
    }

    public static void setUser(User user) {
        UI.user = user;
    }

    public static User getUser() {
        return user;
    }

    public static void setInput(String input) {
        UI.input = input;
    }

    public static String getInput() {
        return input;
    }

    public static BookManager getBookManager() {
        return bookManager;
    }

    public static MovieManager getMovieManager() {
        return movieManager;
    }
}
