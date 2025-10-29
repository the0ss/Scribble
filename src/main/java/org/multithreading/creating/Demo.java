package org.multithreading.creating;

public class Demo {
  public static void main(String[] args) throws InterruptedException {
    UsingThreadClass threadWrapper = new UsingThreadClass();
    threadWrapper.start();

    UsingRunnableInterface usingRunnableInterface = new UsingRunnableInterface();
    Thread thread2 = new Thread(usingRunnableInterface);
    thread2.start();

    Thread thread3 =
        new Thread(
            () -> {
              System.out.println(
                  "Thread 3 using lambda expression and name: " + Thread.currentThread().getName());
            },
            "Thread 3");
    thread3.start();
  }
}
