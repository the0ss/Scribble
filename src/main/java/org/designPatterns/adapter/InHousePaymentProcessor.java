package org.designPatterns.adapter;

import java.util.UUID;

public class InHousePaymentProcessor implements PaymentProcessor {
  private String transactionId;
  private Boolean isPaymentSuccessful;

  @Override
  public void processPayment(Double payment) {
    System.out.println("Inside Inhouse for payment: " + payment);
    transactionId = "TXN_" + UUID.randomUUID();
    isPaymentSuccessful = Boolean.TRUE;
  }

  @Override
  public Boolean isPaymentSuccessful() {
    return isPaymentSuccessful;
  }

  @Override
  public String getTransactionId() {
    return transactionId;
  }
}
