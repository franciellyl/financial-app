package poc.bff.service;

import org.springframework.stereotype.Service;
import poc.bff.entity.ExpenseEntity;
import poc.bff.repository.ExpenseRepository;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    public ExpenseService(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    public List<ExpenseEntity> getExpenses(int limit, int page){
        var expenseEntity = expenseRepository.findAll();

        return expenseEntity;
    }
}
