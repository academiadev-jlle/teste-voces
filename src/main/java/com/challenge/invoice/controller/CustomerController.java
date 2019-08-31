package com.challenge.invoice.controller;

import com.challenge.invoice.entity.Customer;
import com.challenge.invoice.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @GetMapping("/customer/{id}")
    public Customer findById(@PathVariable Long id) {
        return customerService.findById(id).orElse(null);
    }

    @GetMapping("/customer")
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @PostMapping("/customer")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

}
