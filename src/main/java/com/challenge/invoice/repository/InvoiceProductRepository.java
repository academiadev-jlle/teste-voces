package com.challenge.invoice.repository;

import com.challenge.invoice.entity.InvoiceProduct;
import com.challenge.invoice.entity.InvoiceProductId;
import com.challenge.invoice.entity.InvoiceStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceProductRepository extends JpaRepository<InvoiceProduct, InvoiceProductId> {

    Page<InvoiceProduct> findByIdInvoiceStatus(InvoiceStatus status, Pageable pageable);

}
