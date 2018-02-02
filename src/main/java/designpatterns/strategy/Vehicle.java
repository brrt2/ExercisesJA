package designpatterns.strategy;

public class Vehicle {

    int length;
    int width;

    Move move;

    public String tryToMove() {
      return move.goForward();
    }

    public void setNewMovingMode(Move newMove) {
      move = newMove;
    }

}
