package designpatterns.strategy;

public class App {

  public static void main(String[] args) {
    Vehicle small = new SmallCar();
    Vehicle big = new BigCar();
    System.out.println(small.tryToMove());
    System.out.println(big.tryToMove());
    big.setNewMovingMode(new DriveFast());
    System.out.println(big.tryToMove());
  }
}
