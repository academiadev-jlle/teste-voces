package com.challenge.invoice.service;

import com.challenge.invoice.entity.InvoiceProduct;
import com.challenge.invoice.entity.InvoiceProductId;
import com.challenge.invoice.repository.InvoiceProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class InvoiceProductService {

    private InvoiceProductRepository invoiceProductRepository;

    public InvoiceProduct save(InvoiceProduct invoiceProduct) {
        return invoiceProductRepository.save(invoiceProduct);
    }

    public Optional<InvoiceProduct> findById(InvoiceProductId id) {
        return invoiceProductRepository.findById(id);
    }

}
