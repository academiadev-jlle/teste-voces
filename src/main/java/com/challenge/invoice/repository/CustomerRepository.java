package com.challenge.invoice.repository;

import com.challenge.invoice.entity.Customer;
import com.challenge.invoice.entity.Invoice;
import com.challenge.invoice.entity.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByNameContainingIgnoreCase(String name);

    List<Customer> findByInvoicesStatusOrInvoicesStatus(InvoiceStatus invoiceStatus, InvoiceStatus status);

    @Query(value = "select c from Customer c where name = :name")
    Optional<Customer> findByName(String name);


}
