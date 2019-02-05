package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    User user;

    @Before
    public void setUpUser() {
        user = new User("testUser", "testPass", "Perico de los Palotes", "perico@gmail.com", "012345678");
    }

    @Test
    public void whenPasswordIsCorrectCheckPasswordReturnsTrue() {
        assertTrue(user.checkPassword("testPass"));
    }

    @Test
    public void whenPasswordIsIncorrectCheckPasswordReturnsFalse() {
        assertFalse(user.checkPassword("wrongPass"));
    }

    @Test
    public void iCanGetUserInfoAsString() {
        String expected = "Name: Perico de los Palotes\n" +
                        "Email: perico@gmail.com\n" +
                        "Phone number: 012345678\n";
        assertEquals(expected, user.getUserInfo());
    }
}