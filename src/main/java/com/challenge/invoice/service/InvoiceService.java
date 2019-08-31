package com.challenge.invoice.service;

import com.challenge.invoice.entity.Invoice;
import com.challenge.invoice.entity.InvoiceProduct;
import com.challenge.invoice.entity.InvoiceProductId;
import com.challenge.invoice.repository.InvoiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InvoiceService extends AbstractService<InvoiceRepository, Invoice, Long> {

    @Autowired
    public InvoiceService(InvoiceRepository repository) {
        super(repository);
    }
}
