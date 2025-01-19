package poc.bff.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import poc.bff.dto.ExpenseDto;
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
    public ResponseEntity<List<ExpenseDto>> listAllExpenses(){
        var expenseResult = expenseService.getExpenses(1,1);
        return ResponseEntity.ok().body(expenseResult);
    }

    @GetMapping("/income")
    public ResponseEntity<String> listAllIncomes(){
        return ResponseEntity.ok("Hi, Income!");
    }

    @GetMapping("/bank")
    public ResponseEntity<String> bankIntegration(){
        return ResponseEntity.ok().body("Oi");
    }
}
