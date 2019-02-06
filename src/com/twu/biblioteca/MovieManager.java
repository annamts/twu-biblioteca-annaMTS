package com.twu.biblioteca;

import java.util.List;

public class MovieManager extends ResourceManager {

    public MovieManager(String fileName) {
        super("movies");
        addMovieList(fileName);
    }

    public void addMovieList(String fileName) {
        List<Resource> listOfMovies = MovieParser.createListOfMovies(fileName);
        super.setResourceList(listOfMovies);
    }

    public Movie findMovie(String movieName) {
        return (Movie)super.findResource(movieName);
    }
}
