package com.hdecoded.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${payment.service}")
    private String paymentService;

    @Bean
//    @Lazy
//    @Scope("prototype")
    public OrderService orderService() {
        if (paymentService.equals("paypal")) {
            return new OrderService(paypal());
        }
        return new OrderService(stripe());
    }

    @Bean
    public PaymentService paypal() {
        return new PayPalPaymentService();
    }

    @Bean
    public PaymentService stripe() {
        return new StripePaymentService();
    }
}
