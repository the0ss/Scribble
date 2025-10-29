package org.designPatterns.strategyFactory;

public interface PaymentStrategy {
    void processPayment(PaymentRequest paymentRequest);
    String getPaymentMethod();
}
