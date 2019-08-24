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
@AllArgsConstructor
public class InvoiceService {

    private InvoiceRepository invoiceRepository;

    public Invoice save(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    public Optional<Invoice> findById(Long id) {
        return invoiceRepository.findById(id);
    }

}
