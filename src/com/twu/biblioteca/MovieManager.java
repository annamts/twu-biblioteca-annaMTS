package com.twu.biblioteca;

import java.util.List;

public class MovieManager {
    private static List<Movie> movieList;

    public static void addMovieList(String fileName) {
        movieList = MovieParser.createListOfMovies(fileName);
    }

    public static String movieListAsString() {
        String result = "These are our available movies:\n";
        for (Movie movie : movieList) {
            if (movie.isAvailable()){
                result += "\n" + movie.toFormattedString();
            }
        }
        return result + "\n";
    }

    public static List<Movie> getMovieList() {
        return movieList;
    }
}
