package com.example.rules;

public class Fibonacci {

    public int next(int number) {
        if (number <= 1) {
            return number;
        }
        return next(number - 1) + next(number - 2);
    }

}
