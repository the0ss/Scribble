package org.designPatterns.chainOfRespon;

public class Demo {
  public static void main(String[] args) {
    RequestHandler basic = new BasicHandler();
    RequestHandler basic1 = new BasicHandler();
    basic.setNext(basic1);
    basic.handle(new Request());
  }
}
