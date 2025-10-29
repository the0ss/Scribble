package org.designPatterns.prototype;

public class Rectangle implements Shape {
  Integer length, width;

  public Rectangle(Integer length, Integer width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public Shape cloneShape() {
    return new Rectangle(length, width);
  }

  @Override
  public void area() {
    System.out.printf("Area of the rectangle: %s%n", length * width);
  }
}
