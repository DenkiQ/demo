package com.example.demo.exceptions;

import lombok.Getter;

@Getter
public class DaysException extends Exception {
    private int d;
    public DaysException (String message, int days) {
        super(message);
        d = days;
    }
}
