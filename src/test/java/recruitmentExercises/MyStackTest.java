package recruitmentExercises;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.assertj.core.api.Assertions.*;


@Test
public class MyStackTest {

  MyStack myStack;

  @BeforeMethod
  public void arrangeForTests() {
    myStack = new MyStack(10);
  }


  public void whenPushMethodCalledThenElementGetsAddedToTheStack() {


    myStack.push("firstElement");
    myStack.push("secondElement");
    assertThat(myStack.peek()).isEqualTo("secondElement");

  }

  @Test(expectedExceptions = IllegalStateException.class)
  public void whenPushMethodCalledAndStackIsFullThrowException() {

    MyStack myStack1 = new MyStack(1);
    myStack1.push("firstElement");
    myStack1.push("secondElement");
    assertThat(myStack1.peek()).isEqualTo("secondElement");

  }

  public void whenPeekMethodCalledThenReturnTheTopElement() {


    myStack.push("firstElement");
    myStack.push("secondElement");
    myStack.push("thirdElement");
    assertThat(myStack.peek()).isEqualTo("thirdElement");

  }

  @Test(expectedExceptions = IllegalStateException.class)
  public void whenPeekMethodCalledAndStackIsEmptyThrowException() {


    assertThat(myStack.peek()).isEqualTo("thirdElement");

  }


  public void whenPopMethodCalledThenReturnTheTopElement() {


    myStack.push("firstElement");
    myStack.push("secondElement");
    myStack.push("thirdElement");
    assertThat(myStack.pop()).isEqualTo("thirdElement");
    assertThat(myStack.pop()).isEqualTo("secondElement");
    assertThat(myStack.pop()).isEqualTo("firstElement");

  }

  @Test(expectedExceptions = IllegalStateException.class)
  public void whenPopMethodCalledAndStackIsEmptyThenThrowException() {


    myStack.pop();

  }

  public void whenIsEmptyMethodCalledAndTheStackIsEmptyReturnTrue() {


    assertThat(myStack.isEmpty()).isEqualTo(true);
  }

  public void whenIsEmptyMethodCalledAndTheStackIsNotEmptyReturnFalse() {

    myStack.push("first");
    assertThat(myStack.isEmpty()).isEqualTo(false);
  }


}