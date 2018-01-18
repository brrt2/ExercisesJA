package designpatterns.strategy;

public class DriveFast implements Move{
  @Override
  public String goForward() {
    return "driving fast";
  }
}
