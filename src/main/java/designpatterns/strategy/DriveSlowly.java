package designpatterns.strategy;

public class DriveSlowly implements Move {
  @Override
  public String goForward() {
    return "drive slowly";
  }
}
