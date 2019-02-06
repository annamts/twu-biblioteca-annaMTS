package com.twu.biblioteca;

import java.util.List;

public class MovieManager {
    private static List<Movie> movieList;

    public static void addMovieList(String fileName) {
        movieList = MovieParser.createListOfMovies(fileName);
    }

    public static String resourceListAsString() {
        String result = "These are our available movies:\n";
        for (Movie movie : movieList) {
            if (movie.isAvailable()){
                result += "\n" + movie.toFormattedString();
            }
        }
        return result + "\n";
    }

    public static Movie findMovie(String movieName) {
        for(Movie movie : movieList) {
            if (movieName.toLowerCase().equals(movie.getName().toLowerCase())) {
                return movie;
            }
        }
        return null;
    }

    public static Boolean checkOut(String movieName) {
        Movie movie = findMovie(movieName);
        if (movie != null && movie.isAvailable()) {
            movie.checkOut();
            return true;
        }
        return false;
    }
}
