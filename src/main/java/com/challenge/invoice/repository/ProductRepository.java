package com.challenge.invoice.repository;

import com.challenge.invoice.entity.Customer;
import com.challenge.invoice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
