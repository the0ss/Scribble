package org.designPatterns.factory;

public class Truck implements Product {
  @Override
  public void doStuff() {
    System.out.println("Doing some truck stuff ");
  }
}
