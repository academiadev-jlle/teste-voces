package com.challenge.invoice.service;

import com.challenge.invoice.entity.Customer;
import com.challenge.invoice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends AbstractService<CustomerRepository, Customer, Long> {

    @Autowired
    public CustomerService(CustomerRepository repository) {
        super(repository);
    }


}
