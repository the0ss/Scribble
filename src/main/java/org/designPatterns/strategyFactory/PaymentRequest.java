package org.designPatterns.strategyFactory;

public class PaymentRequest {
  private Double amount;
  private String paymentDescription;

  public PaymentRequest(Double amount, String paymentDescription) {
    this.amount = amount;
    this.paymentDescription = paymentDescription;
  }

  public Double getAmount() {
    return amount;
  }

  public String getPaymentDescription() {
    return paymentDescription;
  }
}
