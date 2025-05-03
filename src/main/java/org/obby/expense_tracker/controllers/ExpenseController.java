package org.obby.expense_tracker.controllers;

import org.obby.expense_tracker.model.Expense;
import org.obby.expense_tracker.service.ExpenseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping("/expense")
    public Expense addExpense(@RequestParam String title, @RequestParam String amount) {
        return expenseService.createExpense(title, amount);
    }

}
