package com.twu.biblioteca;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MovieParserTest {

    @Test
    public void resourceParserCreatesMovieFromString() {
        Movie movie = MovieParser.createMovie("Movie,, Director,, 1987,, 3.2");
        assertEquals("Movie", movie.getTitle());
        assertEquals("Director", movie.getDirector());
        assertEquals((Integer)1987, movie.getYear());
        assertEquals((Double)3.2, movie.getRating());
    }

    @Test
    public void resourceParserCreatesListOfMovies() {
        List<Resource> movieList = MovieParser.createListOfMovies("test_resources/movies.txt");
        assertEquals(5, movieList.size());
    }
}