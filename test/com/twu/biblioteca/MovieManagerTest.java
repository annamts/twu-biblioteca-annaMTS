package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieManagerTest {

    MovieManager movieManager;

    @Before
    public void setUp() {
        movieManager = new MovieManager("test_resources/movies.txt");
    }

    @Test
    public void whenLookingForTitleThatExistsFindMovieReturnsMovie() {
        assertEquals("Pulp Fiction", movieManager.findMovie("Pulp Fiction").getTitle());
    }

    @Test
    public void whenLookingForTitleThatDoesNotExistFindMovieReturnsNull() {
        assertEquals(null, movieManager.findMovie("blabla"));
    }

    @Test
    public void movieIsCheckedOut() {
        movieManager.checkOut("Pulp Fiction");
        assertEquals(false, movieManager.findMovie("Pulp Fiction").isAvailable());
    }

    @Test
    public void whenMovieIsAvailableMethodCheckOutReturnsTrue() {
        assertEquals(true, movieManager.checkOut("Pulp Fiction"));
    }

    @Test
    public void whenMovieIsAlreadyCheckedOutMethodCheckOutReturnsFalse() {
        movieManager.checkOut("Pulp Fiction");
        assertEquals(false, movieManager.checkOut("Pulp Fiction"));
    }

    @Test
    public void whenMovieDoesNotExistCheckOutReturnsFalse() {
        assertEquals(false, movieManager.checkOut("blabla"));
    }
}