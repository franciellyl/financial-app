package poc.bff.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import poc.bff.entity.PaymentsEntity;

public interface PaymentRepository extends JpaRepository<PaymentsEntity, Long> {
}
