package com.ecom.product;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<ProductDto> getProducts() {
        return List.of(
                new ProductDto("P1001", "Laptop", new BigDecimal("999.00")),
                new ProductDto("P1002", "Keyboard", new BigDecimal("59.00"))
        );
    }

    public record ProductDto(String sku, String name, BigDecimal price) {
    }
}
