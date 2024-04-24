package com.insy2s.backopenapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRequest(
        @NotBlank
        String name,
        String description,
        String category,
        String brand,
        @NotNull
        Integer price,
        Integer quantity,
        String image
) {
}
