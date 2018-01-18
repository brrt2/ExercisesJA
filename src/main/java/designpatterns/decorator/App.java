package designpatterns.decorator;

public class App {

  public static void main(String[] args) {

    Pizza customPizza = new Ham(new Pepper(new BasicPizza()));
    System.out.println("Ingredients " + customPizza.getDescription());
    System.out.println("Price " + customPizza.getCost());
  }

}
