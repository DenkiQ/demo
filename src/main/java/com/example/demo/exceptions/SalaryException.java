package com.example.demo.exceptions;

import lombok.Getter;

@Getter
public class SalaryException extends Exception {
    private double s;
    public SalaryException (String message, double salary) {
        super(message);
        s = salary;
    }
}
