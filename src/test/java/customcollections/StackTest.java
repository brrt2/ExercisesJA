package customcollections;

import org.testng.annotations.Test;

import javax.swing.plaf.nimbus.State;

import static org.assertj.core.api.Assertions.*;

import static org.testng.Assert.*;

@Test
public class StackTest {


  public void whenPushMethodWasCalledThenElementAddedToTheStack() {

    Stack stack = new Stack(10);
    stack.push("First element");
    assertThat(stack.peek()).isEqualTo("First element");

  }

  @Test(expectedExceptions = IllegalStateException.class)
  public void whenPushMethodWasCalledAndTheStackIsFullThrowException() {

    Stack stack = new Stack(1);
    stack.push("First element");
    stack.push("Second element");

  }

  public void whenPeekMethodWasCalledReturnTheTopElement() {

    Stack stack = new Stack(10);
    stack.push("First element");
    stack.push("Second element");
    assertThat(stack.peek()).isEqualTo("Second element");
  }

  @Test(expectedExceptions = IllegalStateException.class)
  public void whenPeekMethodWasCalledAndStackIsEmptyThrowException() {
    Stack stack = new Stack(10);
    stack.peek();
  }


  public void whenPopMethodCalledRetrieveTheTopElement() {
    Stack stack = new Stack(10);
    stack.push("First");
    stack.push("Second");
    stack.push("Third");
    assertThat(stack.pop()).isEqualTo("Third");
  }

  @Test(expectedExceptions = IllegalStateException.class)
  public void whenPopMethodCalledAndStackIsEmptyThrowException() {
    Stack stack = new Stack(10);
    stack.pop();
  }


  public void whenStackIsEmptyThenReturnTrue() {
    Stack stack = new Stack(10);
    assertThat(stack.isEmpty()).isTrue();

  }

  public void whenStackIsNotEmptyThenReturnFalse() {
    Stack stack = new Stack(10);
    stack.push("First");
    assertThat(stack.isEmpty()).isFalse();

  }
  
}