package com.hdecoded.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        //SpringApplication.run(StoreApplication.class, args);

        // Setter Injection
        // If we forget to set the paymentService we will get a Null pointer
        // only used for optional Dependencies

        var OrderService = new OrderService();
        OrderService.setPaymentService(new StripePaymentService());
        OrderService.placeOrder();

        // Constructor Injection
        // Passing the object from a constructor
        // More common and recommended way to inject
        var OrderService2 = new OrderService(new PayPalPaymentService());
        OrderService2.placeOrder();
    }
}
