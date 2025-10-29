package org.designPatterns.adapter;

public class LegacyPaymentProcessor {
  private Long transactionReference;
  private boolean isPaymentSuccessful;

  public void executeTransaction(double totalAmount) {
    System.out.println("LegacyGateway: Executing transaction for " + " " + totalAmount);
    transactionReference = System.nanoTime();
    isPaymentSuccessful = true;
    System.out.println(
        "LegacyGateway: Transaction executed successfully. Txn ID: " + transactionReference);
  }

  public boolean checkStatus(long transactionReference) {
    System.out.println("LegacyGateway: Checking status for ref: " + transactionReference);
    return isPaymentSuccessful;
  }

  public Long getReferenceNumber() {
    return transactionReference;
  }

    public boolean isPaymentSuccessful() {
        return isPaymentSuccessful;
    }
}
