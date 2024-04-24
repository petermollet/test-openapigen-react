package com.insy2s.backopenapi.controller;

import com.insy2s.backopenapi.dto.ProductMiniResponse;
import com.insy2s.backopenapi.dto.ProductRequest;
import com.insy2s.backopenapi.dto.ProductResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/api/products")
@RestController
public class MainController {

    @GetMapping
    public List<ProductMiniResponse> getAll() {
        return List.of(
                new ProductMiniResponse(1L, "Product 1", 100),
                new ProductMiniResponse(2L, "Product 2", 200),
                new ProductMiniResponse(3L, "Product 3", 300)
        );
    }

    @GetMapping("/{id}")
    public ProductResponse getById(@PathVariable Long id) {
        return new ProductResponse(
                id,
                "Product " + id,
                "Description of product " + id,
                "Category of product " + id,
                "Brand of product " + id,
                100,
                10,
                "Image of product " + id
        );
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Product created")
    })
    @PostMapping
    public ResponseEntity<ProductResponse> create(@Valid @RequestBody ProductRequest productRequest) {
        ProductResponse productResponse = new ProductResponse(
                4L,
                productRequest.name(),
                productRequest.description(),
                productRequest.category(),
                productRequest.brand(),
                productRequest.price(),
                productRequest.quantity(),
                productRequest.image()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(productResponse);
    }

}
