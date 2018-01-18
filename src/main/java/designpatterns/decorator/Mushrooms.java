package designpatterns.decorator;

public class Mushrooms extends ToppingDecorator {

  public Mushrooms(Pizza pizza) {
    super(pizza);
  }
  public String getDescription() {
    return pizza.getDescription() + " mushrooms";
  }

  public int getCost() {
    return pizza.getCost() + 6;
  }

}
