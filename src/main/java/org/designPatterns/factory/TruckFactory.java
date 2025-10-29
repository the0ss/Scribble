package org.designPatterns.factory;

public class TruckFactory implements ProductFactory {
  @Override
  public Product createProduct() {
    return new Truck();
  }
}
