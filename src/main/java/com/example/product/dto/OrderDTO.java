package com.example.product.dto;

import java.math.BigDecimal;

public record OrderDTO(
        Long id,
        Long productId,
        Integer quantity,
        BigDecimal totalPrice
) {
}
