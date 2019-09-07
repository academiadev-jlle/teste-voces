package com.challenge.invoice.controller;

import com.challenge.invoice.entity.Customer;
import com.challenge.invoice.entity.User;
import com.challenge.invoice.service.CustomerService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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

    @ApiImplicitParams({
            @ApiImplicitParam(name = "Authorization", required = true, paramType = "header")
    })
    @GetMapping("/customer")
    public List<Customer> findAll() {
        User o = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return customerService.findAll();
    }

    @PostMapping("/customer")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

}
