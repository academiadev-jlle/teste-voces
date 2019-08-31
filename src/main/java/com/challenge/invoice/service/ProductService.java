package com.challenge.invoice.service;

import com.challenge.invoice.entity.Product;
import com.challenge.invoice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService extends AbstractService<ProductRepository, Product, Long> {

    @Autowired
    public ProductService(ProductRepository repository) {
        super(repository);
    }
}
