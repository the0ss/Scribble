package org.multithreading.oddEven;

public class CountingClass {
  private Integer count;
  private Boolean isOddTurn = Boolean.TRUE;
  private static final Integer MAX = 100;

  public CountingClass(Integer count) {
    this.count = count;
  }

  public synchronized void printOdd() {
    while (count <= MAX) {
      while (!isOddTurn) {
        try {
          wait();
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
      if (count <= MAX) {
        System.out.println("Count: " + count + ", Thread: " + Thread.currentThread().getName());
        count++;
        isOddTurn = false;
        notify();
      }
    }
  }

  public synchronized void printEven() {
    while (count <= MAX) {
      while (isOddTurn) {
        try {
          wait();
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
      if (count <= MAX) {
        System.out.println("Count: " + count + ", Thread: " + Thread.currentThread().getName());
        count++;
        isOddTurn = true;
        notify();
      }
    }
  }
}
