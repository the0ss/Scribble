package org.designPatterns.adapter;

public class LegacyPaymentProcessorAdapter implements PaymentProcessor {
  private LegacyPaymentProcessor legacyPaymentProcessor;

  public LegacyPaymentProcessorAdapter(LegacyPaymentProcessor legacyPaymentProcessor) {
    this.legacyPaymentProcessor = legacyPaymentProcessor;
  }

  @Override
  public void processPayment(Double payment) {
    legacyPaymentProcessor.executeTransaction(payment);
  }

  @Override
  public Boolean isPaymentSuccessful() {
    return legacyPaymentProcessor.isPaymentSuccessful();
  }

  @Override
  public String getTransactionId() {
    return legacyPaymentProcessor.getReferenceNumber().toString();
  }
}
