package poc.bff.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import poc.bff.entity.ExpenseEntity;
import poc.bff.service.ExpenseService;

import java.util.List;

@RestController
@RequestMapping("/financial-app")
public class FinancialAppController {
    private final ExpenseService expenseService;

    public FinancialAppController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/expenses")
    public ResponseEntity<List<ExpenseEntity>>sayHello(){

        return ResponseEntity.ok(expenseService.getExpenses(0,0));
    }
}
