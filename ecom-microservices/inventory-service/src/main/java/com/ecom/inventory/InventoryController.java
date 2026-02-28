package com.ecom.inventory;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @GetMapping("/{sku}")
    public Map<String, Object> getInventory(@PathVariable String sku) {
        return Map.of("sku", sku, "available", true, "quantity", 42);
    }
}
