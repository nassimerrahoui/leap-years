package com.ippon.kata;

public record Year(int year) {
    public boolean isLeap() {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
