package com.challenge.invoice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceProduct {

    private Invoice invoice;
    private Product product;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAT;

}
