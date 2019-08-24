package com.challenge.invoice.entity;

import javax.persistence.ManyToOne;

public class ProductProvider {

    @ManyToOne
    private Provider provider;

    @ManyToOne
    private Product product;

}
