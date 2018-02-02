package customcollections;

import java.util.Arrays;

public class Stack {

  private String[] stackArray;
  private int stackSize;
  private int stackTop;

  Stack(int stackSize) {
    stackArray = new String[stackSize];
    this.stackSize = stackSize;
    Arrays.fill(stackArray, "empty");
    stackTop = -1;
  }

  void push(String element) {

    if (stackTop < stackSize - 1) {
      stackTop++;
      stackArray[stackTop] = element;
    } else {
      throw new IllegalStateException("Stack is full");
    }
  }

  String peek() {

    if (stackTop == -1) {
      throw new IllegalStateException("Stack is empty");
    } else {
      return stackArray[stackTop];
    }
  }

  String pop() {
    if (stackTop == -1) {
      throw new IllegalStateException("Stack is empty");
    }
    String elementToReturn = stackArray[stackTop];
    stackTop--;
    return elementToReturn;
  }

  boolean isEmpty() {
    return stackTop == -1;
  }


}
