package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogInTest {
    User user;

    @Before
    public void setUp() {
        user = new User("testUser", "testPass");
    }

    @After
    public void resetUser() {
        UI.setUser(Users.NO_USER);
    }

    @Test
    public void whenPasswordIsCorrectUserIsCheckedIn() {
        LogIn.logInPassword(user, "testPass");
        assertEquals(user, UI.getUser());
    }

    @Test
    public void whenPasswordIsNotCorrectUserIsNotCheckedIn() {
        LogIn.logInPassword(user, "wrongPass");
        assertEquals(Users.NO_USER, UI.getUser());
    }
}