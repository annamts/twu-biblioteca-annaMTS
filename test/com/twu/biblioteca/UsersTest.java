package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {
    @Test
    public void whenUserIdExistsUserIdExistsReturnsTrue() {
        assertTrue(Users.userIdExists("user1"));
    }

    @Test
    public void whenUserIdDoesNotExistUserIdExistsReturnsFalse() {
        assertFalse(Users.userIdExists("made_up_user"));
    }
}