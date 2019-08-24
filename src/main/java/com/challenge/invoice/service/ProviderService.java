package com.challenge.invoice.service;

import com.challenge.invoice.entity.Provider;
import com.challenge.invoice.repository.ProviderRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ProviderService {

    private ProviderRepository providerRepository;

    public Provider save(Provider product) {
        return providerRepository.save(product);
    }

    public Optional<Provider> findById(Long id) {
        return providerRepository.findById(id);
    }

}
