package poc.bff.service;

import org.springframework.stereotype.Service;
import poc.bff.dto.PaymentDto;
import poc.bff.entity.PaymentsEntity;
import poc.bff.repository.PaymentRepository;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public void createPayment(PaymentDto requestBody) {
        var entity = dtoToEntity(requestBody);
         paymentRepository.saveAndFlush(entity);
    }

    private PaymentsEntity dtoToEntity(PaymentDto requestBody){
        PaymentsEntity entity = new PaymentsEntity();
        entity.setTitleOfPayment(requestBody.title());
        entity.setValueOfPayment(requestBody.value());
        entity.setDateOfPaymemt(requestBody.date());
        entity.setTypeOfPayment(requestBody.type());
        return entity;
    }
    public void bankingIntegration(){

    }
}
