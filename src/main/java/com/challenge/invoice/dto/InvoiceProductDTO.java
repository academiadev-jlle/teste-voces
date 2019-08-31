package com.challenge.invoice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InvoiceProductDTO {

    private Long productId;
    private Long invoiceId;

    private String createdAt;
    private String updatedAT;

}
