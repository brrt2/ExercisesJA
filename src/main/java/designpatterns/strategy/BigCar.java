package designpatterns.strategy;

public class BigCar extends Vehicle {

  public BigCar() {
    move = new DriveSlowly();
  }
}
