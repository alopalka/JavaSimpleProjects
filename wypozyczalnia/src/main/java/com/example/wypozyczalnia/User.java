package com.example.wypozyczalnia;

import org.springframework.stereotype.Component;

public class User {

    private final long userId;

    public User(long userId) {
        this.userId = userId;
    }

    public long getUserId() {
        return userId;
    }
}
