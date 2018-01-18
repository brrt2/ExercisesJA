package designpatterns.strategy;

public class SmallCar extends Vehicle {

  public SmallCar() {
    move = new DriveFast();
  }
}
