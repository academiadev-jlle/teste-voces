package com.challenge.invoice.repository;

import com.challenge.invoice.entity.Product;
import com.challenge.invoice.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
