package org.obby.expense_tracker.service;

import org.obby.expense_tracker.model.Expense;
import org.obby.expense_tracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseService {
    ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public Expense createExpense(String title, String amount) {
        BigDecimal amountBigDecimal = new BigDecimal(amount);
        Expense newExpense = new Expense(title, amountBigDecimal);
        expenseRepository.save(newExpense);
        return newExpense;
    }
}