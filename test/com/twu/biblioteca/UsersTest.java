package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {
    @Test
    public void whenUserIdExistsUserIdExistsReturnsTrue() {
        assertTrue(Users.userIdExists("123-4567"));
    }

    @Test
    public void whenUserIdDoesNotExistUserIdExistsReturnsFalse() {
        assertFalse(Users.userIdExists("made_up_user"));
    }
}