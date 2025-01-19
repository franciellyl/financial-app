package poc.bff.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "tb_payments")
@Getter
@Setter
public class PaymentsEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String titleOfPayment;

    @Column(name = "date")
    private Date dateOfPaymemt;

    @Column(name = "value")
    private BigDecimal valueOfPayment;

    @Column(name = "type")
    private String typeOfPayment;

}
