package org.designPatterns.prototype;

public class Circle implements Shape {
  Integer radius;

  public Circle(Integer radius) {
    this.radius = radius;
  }

  @Override
  public Shape cloneShape() {
    return new Circle(radius);
  }

  @Override
  public void area() {
    System.out.printf("Area of circle: %S%n", 3.14 * radius * radius);
  }
}
