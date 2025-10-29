package org.designPatterns.factory;

public class ShipFactory implements ProductFactory {
  @Override
  public Product createProduct() {
    return new Ship();
  }
}
