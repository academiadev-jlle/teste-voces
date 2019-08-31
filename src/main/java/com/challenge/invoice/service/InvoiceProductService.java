package com.challenge.invoice.service;

import com.challenge.invoice.entity.InvoiceProduct;
import com.challenge.invoice.entity.InvoiceProductId;
import com.challenge.invoice.repository.InvoiceProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InvoiceProductService extends AbstractService<InvoiceProductRepository, InvoiceProduct, InvoiceProductId> {

    @Autowired
    public InvoiceProductService(InvoiceProductRepository repository) {
        super(repository);
    }

    public Optional<InvoiceProduct> findById(Long invoiceId, Long productId) {
        return this.repository.findByIdInvoiceIdAndIdProductId(invoiceId, productId);
    }
}
