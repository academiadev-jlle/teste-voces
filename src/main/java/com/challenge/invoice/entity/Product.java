package com.challenge.invoice.entity;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    private Long id;
    private String name;
    private BigDecimal costPrice;
    private BigDecimal salePrice;
    private BigDecimal taxValue;
    private Provider provider;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private List<InvoiceProduct> invoices;

}
