package org.multithreading.creating;

public class UsingRunnableInterface implements Runnable {
  @Override
  public void run() {
    System.out.println("thread using runnable interface");
  }
}
