package org.designPatterns.strategyFactory;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {

  private PaymentFactory() {
    registerStrategy(UPIStrategy.getInstance());
    registerStrategy(CreditCardStrategy.getInstance());
  }

  private static final Map<String, PaymentStrategy> paymentStrategyHashMap = new HashMap<>();

  private static void registerStrategy(PaymentStrategy paymentStrategy) {
    paymentStrategyHashMap.putIfAbsent(paymentStrategy.getPaymentMethod(), paymentStrategy);
  }

  public PaymentStrategy getPaymentStrategy(String paymentStrategy) {
    return paymentStrategyHashMap.getOrDefault(paymentStrategy, UPIStrategy.getInstance());
  }

  public static PaymentFactory getInstance() {
    return SingletonHelper.INSTANCE;
  }

  private static class SingletonHelper {
    private static final PaymentFactory INSTANCE = new PaymentFactory();
  }
}
