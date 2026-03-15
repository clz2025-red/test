package com.example.product.dto;

import java.math.BigDecimal;

public record ProductDTO(
        Long id,
        String name,
        String description,
        BigDecimal price,
        Integer stockQuantity
) {
}
