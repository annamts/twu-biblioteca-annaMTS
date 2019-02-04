package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieManagerTest {
    @Before
    public void setUp() {
        MovieManager.addMovieList("test_resources/movies.txt");
    }

    @Test
    public void whenLookingForTitleThatExistsFindMovieReturnsMovie() {
        assertEquals("Pulp Fiction", MovieManager.findMovie("Pulp Fiction").getName());
    }

    @Test
    public void whenLookingForTitleThatDoesNotExistFindMovieReturnsNull() {
        assertEquals(null, MovieManager.findMovie("blabla"));
    }

    @Test
    public void movieIsCheckedOut() {
        MovieManager.checkOut("Pulp Fiction");
        assertEquals(false, MovieManager.findMovie("Pulp Fiction").isAvailable());
    }

    @Test
    public void whenMovieIsAvailableMethodCheckOutReturnsTrue() {
        assertEquals(true, MovieManager.checkOut("Pulp Fiction"));
    }

    @Test
    public void whenMovieIsAlreadyCheckedOutMethodCheckOutReturnsFalse() {
        MovieManager.checkOut("Pulp Fiction");
        assertEquals(false, MovieManager.checkOut("Pulp Fiction"));
    }

    @Test
    public void whenMovieDoesNotExistCheckOutReturnsFalse() {
        assertEquals(false, MovieManager.checkOut("blabla"));
    }
}