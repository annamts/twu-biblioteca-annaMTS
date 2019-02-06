package com.twu.biblioteca;

public abstract class Resource {

    private String title;
    private Boolean available = true;

    public Resource(String title) {
        this.title = title;
    }

    public abstract String toFormattedString();

    public void checkOut() {
        this.available = false;
    }

    public String getTitle() {
        return title;
    }

    public Boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        if(this instanceof Book) {
            this.available = available;
        }
    }
}
