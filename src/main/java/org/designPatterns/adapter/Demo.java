package org.designPatterns.adapter;

public class Demo {
  public static void main(String[] args) {
    PaymentProcessor paymentProcessor = new InHousePaymentProcessor();
    PaymentProcessor legacy = new LegacyPaymentProcessorAdapter(new LegacyPaymentProcessor());

    CheckoutService checkoutService = new CheckoutService(paymentProcessor);
    checkoutService.checkout(100.0);

    System.out.println();

    checkoutService = new CheckoutService(legacy);
    checkoutService.checkout(110);
  }
}
