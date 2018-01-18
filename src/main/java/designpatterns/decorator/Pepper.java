package designpatterns.decorator;

public class Pepper extends ToppingDecorator{

  public Pepper(Pizza newPizza) {

    super(newPizza);
  }

  public String getDescription() {
    return pizza.getDescription()+" pepper";
  }

  public int getCost() {
    return pizza.getCost() + 2;
  }

}
