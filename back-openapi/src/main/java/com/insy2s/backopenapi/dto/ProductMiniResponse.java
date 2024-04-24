package com.insy2s.backopenapi.dto;

public record ProductMiniResponse(
        Long id,
        String name,
        Integer price
) {
}
