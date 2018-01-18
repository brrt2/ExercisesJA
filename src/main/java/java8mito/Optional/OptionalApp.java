package java8mito.Optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalApp {

  public static void main(String[] args) {
    OptionalApp optionalApp = new OptionalApp();
//    optionalApp.launch(null);
//    optionalApp.orElse(null);
//    optionalApp.orElseThrow(null);
      optionalApp.isPresent("aaa");
  }


  private void launch(String value) {

    Optional<String> op = Optional.empty();
    String x = op.get();
    try {
      System.out.println(x.contains("bar"));
    }catch (NoSuchElementException e) {
      e.printStackTrace();
    }

  }

  private void orElse(String value) {
    Optional<String> op = Optional.ofNullable(value);
    String x = op.orElse("The provided value is null");
    System.out.println(x);

  }

  private void orElseThrow(String value) {
    Optional<String> op = Optional.ofNullable(value);
    String x = op.orElseThrow(NumberFormatException::new);
    System.out.println(x);

  }


  private void isPresent(String value) {
    Optional<String> op = Optional.ofNullable(value);

    System.out.println(op.isPresent());

  }








}
