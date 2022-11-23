package com.example.carrent;

public class User {

    private final long userId;

    public User(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return String.valueOf(userId);
    }
}
