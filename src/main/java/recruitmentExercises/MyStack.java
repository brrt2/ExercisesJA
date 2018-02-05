package recruitmentExercises;

public class MyStack {

  String[] stackArray;
  int size;
  int stackTop;


  public MyStack(int size) {
    stackArray = new String[size];
    this.size = size;
    stackTop = -1;
  }

  public void push(String element) {

    if (stackTop == size - 1) throw new IllegalStateException("Stack is full");
    stackArray[++stackTop] = element;

  }

  public String peek() {
    checkIfStackEmpty();
    return stackArray[stackTop];
  }

  public String pop() {
    checkIfStackEmpty();

    String poppedObject = stackArray[stackTop];
    stackArray[stackTop] = null;
    stackTop--;

    return poppedObject;
  }

  public boolean isEmpty() {
    return stackTop < 0;
  }


  private void checkIfStackEmpty() {
    if(stackTop < 0 ) throw new IllegalStateException("Stack is empty");
  }

}
