package org.designPatterns.prototype;

public class Demo {
  public static void main(String[] args) {
    Shape circle = new Circle(1);
    Shape rectangle = new Rectangle(1, 2);
    Shape circleTwo = circle.cloneShape();
    Shape rectangleTwo = rectangle.cloneShape();
    rectangleTwo.area();
  }
}
