package com.challenge.invoice.controller;

import com.challenge.invoice.entity.Provider;
import com.challenge.invoice.service.ProviderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProviderController {

    private ProviderService providerService;

    @GetMapping("/provider/{id}")
    public Provider findById(@PathVariable Long id) {
        return providerService.findById(id).orElse(null);
    }

    @GetMapping("/provider")
    public List<Provider> findAll() {
        return providerService.findAll();
    }

    @PostMapping("/provider")
    public Provider save(@RequestBody Provider provider) {
        return providerService.save(provider);
    }
}
