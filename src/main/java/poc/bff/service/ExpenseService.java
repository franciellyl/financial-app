package poc.bff.service;

import org.springframework.stereotype.Service;
import poc.bff.dto.ExpenseDto;
import poc.bff.entity.ExpenseEntity;
import poc.bff.repository.ExpenseRepository;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    public ExpenseService(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    public List<ExpenseDto> getExpenses(int limit, int page){
        var expenseEntity = expenseRepository.findAll();
        List<ExpenseDto> expenseDto = expenseEntity.stream().map(this::entityToDto).toList();
        return expenseDto;
    }

    private ExpenseDto entityToDto(ExpenseEntity entity){
        return  ExpenseDto.builder()
                .idDto(entity.getId())
                .statusDto(entity.getStatus())
                .dateDto(entity.getDate())
                .valueDto(entity.getValue()).build();
    }
}
