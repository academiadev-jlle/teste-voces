package com.challenge.invoice.entity;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Provider {

    private Long id;
    private String name;

    private List<Product> products;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
