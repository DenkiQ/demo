package com.example.demo.services;

import com.example.demo.exceptions.DaysException;
import com.example.demo.exceptions.SalaryException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculateService {
    public double payment(double salary, int days) throws DaysException, SalaryException {
        if (days <= 0) {
            throw new DaysException("Число не может быть <= 0", days);
        }
        if (salary <= 0) {
            throw new SalaryException("Число не может быть <= 0", salary);
        }
        return ((salary/(12*29.3))*days)*0.87;
    }
}
