package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    User user;

    @Before
    public void setUpUser() {
        user = new User("testUser", "testPass");
    }

    @Test
    public void whenPasswordIsCorrectCheckPasswordReturnsTrue() {
        assertTrue(user.checkPassword("testPass"));
    }

    @Test
    public void whenPasswordIsIncorrectCheckPasswordReturnsFalse() {
        assertFalse(user.checkPassword("wrongPass"));
    }
}