package org.designPatterns.factory;

public class Demo {
  public static ProductFactory factory;

  public static void main(String[] args) {
    configure(false);
    runBusinessLogic();
  }

  static void configure(Boolean bool) {
    if (Boolean.TRUE.equals(bool)) {
      factory = new TruckFactory();
    } else {
      factory = new ShipFactory();
    }
  }

  static void runBusinessLogic() {
    factory.render();

  }
}
