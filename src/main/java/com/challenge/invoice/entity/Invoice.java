package com.challenge.invoice.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private LocalDate emissionDate;

    @NotNull
    private BigDecimal totalValue;

    @NotNull
    private BigDecimal discount;

    @NotNull
    @Enumerated(EnumType.STRING)
    private InvoiceStatus status;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "id.invoice")
    private List<InvoiceProduct> products;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

}
