package org.designPatterns.decorator;

public class ExtraCheese extends PizzaDecorator {
  public ExtraCheese(Pizza pizza) {
    super(pizza);
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + "Extra Cheese";
  }

  @Override
  public Integer getCost() {
    return pizza.getCost() + 1;
  }
}
