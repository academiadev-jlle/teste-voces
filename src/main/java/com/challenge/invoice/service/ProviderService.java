package com.challenge.invoice.service;

import com.challenge.invoice.entity.Provider;
import com.challenge.invoice.repository.ProductRepository;
import com.challenge.invoice.repository.ProviderRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProviderService extends AbstractService<ProviderRepository, Provider, Long> {

    @Autowired
    public ProviderService(ProviderRepository repository) {
        super(repository);
    }
}
