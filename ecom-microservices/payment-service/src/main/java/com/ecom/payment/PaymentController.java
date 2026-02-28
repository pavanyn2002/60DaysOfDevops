package com.ecom.payment;

import java.math.BigDecimal;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @PostMapping
    public Map<String, Object> pay(@RequestBody PaymentRequest request) {
        return Map.of("orderId", request.orderId(), "amount", request.amount(), "status", "PAID");
    }

    public record PaymentRequest(String orderId, BigDecimal amount) {
    }
}
