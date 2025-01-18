package poc.bff.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import poc.bff.entity.ExpenseEntity;

public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {
}
