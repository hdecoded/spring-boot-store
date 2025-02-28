package com.hdecoded.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Service
public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService created");
    }

    @PostConstruct
    public void init() {
        System.out.println("OrderService PostConstructs");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("OrderService cleanUp");
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
