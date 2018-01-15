package designpatterns.decorator;

public class BasicPizza implements Pizza{

  @Override
  public String getDescription() {
    return "dough";
  }

  @Override
  public int getCost() {
    return 5;
  }
}
