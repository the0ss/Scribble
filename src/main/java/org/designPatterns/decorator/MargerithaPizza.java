package org.designPatterns.decorator;

public class MargerithaPizza implements Pizza {
  @Override
  public String getDescription() {
    return "MargerithaPizza :: ";
  }

  @Override
  public Integer getCost() {
    return 5;
  }
}
