package com.hdecoded.store;

//@Service("paypal")
public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("AMOUNT: " + amount);
    }
}
