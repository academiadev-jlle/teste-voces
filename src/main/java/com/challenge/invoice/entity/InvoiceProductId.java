package com.challenge.invoice.entity;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class InvoiceProductId implements Serializable {

    @ManyToOne
    private Invoice invoice;

    @ManyToOne
    private Product product;

}
