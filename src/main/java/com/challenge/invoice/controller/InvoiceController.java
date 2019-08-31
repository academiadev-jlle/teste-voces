package com.challenge.invoice.controller;

import com.challenge.invoice.entity.Invoice;
import com.challenge.invoice.service.InvoiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvoiceController {

    private InvoiceService invoiceService;

    @GetMapping("/invoice/{id}")
    public Invoice findById(@PathVariable Long id) {
        return invoiceService.findById(id).orElse(null);
    }

    @GetMapping("/invoice")
    public List<Invoice> findAll() {
        return invoiceService.findAll();
    }

    @PostMapping("/invoice")
    public Invoice save(@RequestBody Invoice invoice) {
        return invoiceService.save(invoice);
    }
}
