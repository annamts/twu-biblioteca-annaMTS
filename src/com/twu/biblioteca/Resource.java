package com.twu.biblioteca;

public abstract class Resource {

    Boolean available = true;

    public abstract String toFormattedString();

    public void checkOut() {
        this.available = false;
    }

    public Boolean isAvailable() {
        return available;
    }
}
