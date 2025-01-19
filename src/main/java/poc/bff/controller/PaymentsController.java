package poc.bff.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import poc.bff.dto.PaymentDto;
import poc.bff.service.PaymentService;

@RestController
@RequestMapping("/financial-app")
public class PaymentsController {

    private final PaymentService paymentService;

    public PaymentsController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payments")
    public ResponseEntity<String> createPayment(@RequestBody PaymentDto requestBody){
        paymentService.createPayment(requestBody);
        return ResponseEntity.created(null).body("Created");
    }
}
