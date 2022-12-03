package com.example.carrent;

public enum CarType {
    STANDARD(50),
    PREMIUM(120),
    BIEDA(35),
    GRUZ(20),
    ;

    private final double stake;

    CarType(double stake) {
        this.stake = stake;
    }

    public double getStake() {
        return stake;
    }
}
