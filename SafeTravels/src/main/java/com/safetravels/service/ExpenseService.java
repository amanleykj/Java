package com.safetravels.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.safetravels.models.Expense;
import com.safetravels.repository.ExpenseRepository;

@Service
public class ExpenseService {
	
	private final ExpenseRepository expenseRepo;
	
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}
	
	public List<Expense> allExpenses() {
		return expenseRepo.findAll();
	}
	
	public Expense addExpense(Expense expense) {
		return expenseRepo.save(expense);
	}
	
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		}
		else {
			return null;
		}
	}
	
	public Expense updateExpense(Expense expense) {
		return expenseRepo.save(expense);
	}
	
	public void deleteExpense(long id) {
		expenseRepo.deleteById(id);
	}

}
