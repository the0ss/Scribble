package org.designPatterns.decorator;

import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();

    Pizza margerithaPizza = new MargerithaPizza();
    if (i == 1) {
      margerithaPizza = new ExtraCheese(margerithaPizza);
    }

    System.out.println(
        margerithaPizza.getDescription() + ", Price :: " + margerithaPizza.getCost());
  }
}
