package com.challenge.invoice.entity;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    private Long id;
    private LocalDate emissionDate;
    private BigDecimal totalValue;
    private BigDecimal discount;
    private InvoiceStatus status;

    private Customer customer;
    private List<InvoiceProduct> products;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
