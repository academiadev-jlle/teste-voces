package com.challenge.invoice.controller;

import com.challenge.invoice.dto.InvoiceProductDTO;
import com.challenge.invoice.entity.Invoice;
import com.challenge.invoice.entity.InvoiceProduct;
import com.challenge.invoice.entity.InvoiceProductId;
import com.challenge.invoice.entity.Product;
import com.challenge.invoice.mapper.InvoiceProductMapper;
import com.challenge.invoice.service.InvoiceProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@AllArgsConstructor
public class InvoiceProductController {

    private InvoiceProductService service;
    private InvoiceProductMapper invoiceProductMapper;

    @GetMapping("/invoice-product/{invoiceId}/{productId}")
    public InvoiceProduct findById(Long invoiceId, Long productId) {
        return service.findById(invoiceId, productId).orElse(null);
    }

    @GetMapping("/invoice-product")
    public List<InvoiceProductDTO> findAll() {
        InvoiceProduct invoiceProduct = InvoiceProduct.builder().id(new InvoiceProductId(new Invoice(15L), new Product(20L)))
                .createdAt(LocalDateTime.now())
                .updatedAT(LocalDateTime.now())
                .build();
        return Arrays.asList(invoiceProductMapper.map(invoiceProduct));
    }

    @PostMapping("/invoice-product")
    public InvoiceProduct save(@RequestBody InvoiceProduct invoiceProduct) {
        return service.save(invoiceProduct);
    }

}
