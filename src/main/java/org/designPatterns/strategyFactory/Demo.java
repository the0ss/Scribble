package org.designPatterns.strategyFactory;

public class Demo {
  public static void main(String[] args) {
    PaymentFactory paymentFactory = PaymentFactory.getInstance();
    paymentFactory
        .getPaymentStrategy("CREDIT_CARD")
        .processPayment(new PaymentRequest(25.0, "Bill"));
  }
}
