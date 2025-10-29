package org.designPatterns.strategyFactory;

public class CreditCardStrategy implements PaymentStrategy {

  private CreditCardStrategy() {}

  @Override
  public void processPayment(PaymentRequest paymentRequest) {
    System.out.println("Processing the payment using credit card: " + paymentRequest.getAmount());
  }

  @Override
  public String getPaymentMethod() {
    return "CREDIT_CARD";
  }

  public static CreditCardStrategy getInstance() {
    return SingletonHelper.INSTANCE;
  }

  private static class SingletonHelper {
    private static final CreditCardStrategy INSTANCE = new CreditCardStrategy();
  }
}
