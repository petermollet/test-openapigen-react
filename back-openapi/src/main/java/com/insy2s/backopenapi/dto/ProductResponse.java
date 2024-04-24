package com.insy2s.backopenapi.dto;

public record ProductResponse(
        Long id,
        String name,
        String description,
        String category,
        String brand,
        Integer price,
        Integer quantity,
        String image
) {
}
