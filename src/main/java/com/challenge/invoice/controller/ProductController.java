package com.challenge.invoice.controller;

import com.challenge.invoice.entity.Product;
import com.challenge.invoice.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    @GetMapping("/product/{id}")
    public Product findById(@PathVariable Long id) {
        return productService.findById(id).orElse(null);
    }

    @GetMapping("/product")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PostMapping("/product")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

}
