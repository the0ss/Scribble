package org.multithreading.oddEven;

public class Demo {
  public static void main(String[] args) {
    CountingClass countingClass = new CountingClass(1);
    Thread odd = new Thread(countingClass::printOdd, "Odd Thread");
    Thread even = new Thread(countingClass::printEven, "Even Thread");

    odd.start();
    even.start();

    try {
      odd.join();
      even.join();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
