package org.designPatterns.strategyFactory;

public class UPIStrategy implements PaymentStrategy {

  private UPIStrategy() {}

  @Override
  public void processPayment(PaymentRequest paymentRequest) {
    System.out.println("Processing the payment using UPI: " + paymentRequest.getAmount());
  }

  @Override
  public String getPaymentMethod() {
    return "UPI";
  }

  public static UPIStrategy getInstance() {
    return SingletonHelper.INSTANCE;
  }

  private static class SingletonHelper {
    private static final UPIStrategy INSTANCE = new UPIStrategy();
  }
}
