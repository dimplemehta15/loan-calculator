package com.mycompany.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping(value = "/v1/api/calculate-loan-amount")
    public Double calculateLoanAmount(@RequestParam(value="desiredAmount") Double principal, @RequestParam(value = "paybackTime") Float numberOfYears) {
        System.out.println("Testing Git command - 1");
        System.out.println("Testing Git command - 5");
        return principal * numberOfYears;
    }
}
