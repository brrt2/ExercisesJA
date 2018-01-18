package designpatterns.decorator;

public class Ham extends ToppingDecorator{

  public Ham(Pizza newPizza) {

    super(newPizza);
  }

    public String getDescription() {
      return pizza.getDescription()+" ham";
  }

  public int getCost() {
    return pizza.getCost() + 3;
  }

}
