package org.designPatterns.adapter;

public interface PaymentProcessor {
    void processPayment(Double payment);
    Boolean isPaymentSuccessful();
    String getTransactionId();
}
