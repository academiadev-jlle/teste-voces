package com.challenge.invoice.entity;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Customer {

    private Long id;
    private String name;
    private LocalDate birthday;
    private String email;

    private List<Invoice> invoices;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAT;

}
