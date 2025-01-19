package poc.bff.dto;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.Date;

@Builder
public record ExpenseDto(
        Long idDto,
        String statusDto,
        Date dateDto,
        BigDecimal valueDto
) {}
