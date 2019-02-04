package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
    Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("Movie", "Director", 1975, 4.5);
    }

    @Test
    public void movieIsReturnedAsFormattedString() {
        assertEquals("Movie                                    Director                  1975       4,5                 ", movie.toFormattedString());
    }
}