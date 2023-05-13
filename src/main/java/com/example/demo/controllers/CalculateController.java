package com.example.demo.controllers;

import com.example.demo.exceptions.DaysException;
import com.example.demo.exceptions.SalaryException;
import com.example.demo.services.CalculateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculate")
@RequiredArgsConstructor
public class CalculateController {
    private final CalculateService calculateService;

    @GetMapping("")
    public double payment(double salary, int days) throws DaysException, SalaryException {
        return calculateService.payment(salary, days);
    }
}
