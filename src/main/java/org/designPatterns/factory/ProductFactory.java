package org.designPatterns.factory;

public interface ProductFactory {

  default void render() {
    Product product = createProduct();
    product.doStuff();
  }

  Product createProduct();
}
