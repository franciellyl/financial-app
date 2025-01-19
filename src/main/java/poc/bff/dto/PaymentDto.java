package poc.bff.dto;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.Date;

@Builder
public record PaymentDto(
        Long id,
        String title,

        Date date,

        BigDecimal value,

        String type
) {
}
