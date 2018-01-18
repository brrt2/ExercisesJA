package java8mito.java8mitoStream;

import java.util.ArrayList;
import java.util.List;

public class StreamsApi {

  List<String> names;
  List<Integer> numbers;


  public StreamsApi() {
    names = new ArrayList<>();
    numbers = new ArrayList<>();
    populateNames();
    populateNumbers();
  }

  public static void main(String[] args) {
    StreamsApi streamsApi = new StreamsApi();
//    streamsApi.filter();
//    streamsApi.orderByName();
//      streamsApi.transform();
//    streamsApi.limit();
    streamsApi.count();
  }


  private void filter() {
    names.stream()
        .filter(p -> p.startsWith("A"))
        .forEach(System.out::println);
  }

  private void orderByName() {
//    names.stream()
//        .sorted()
//        .forEach(System.out::println);

    names.stream()
        .sorted((x,y) -> y.compareTo(x))
        .forEach(System.out::println);
  }


  private void transform() {
//    names.stream()
//        .map(String::toUpperCase)
//        .forEach(System.out::println);

    numbers.stream()
        .map(x -> x +1)
        .forEach(System.out::println);

    for(Integer x : numbers) {
      int y = x +1;
      System.out.println(y);
    }
  }

  private void limit() {
    numbers.stream()
        .limit(3)
        .forEach(System.out::println);
  }

  private void count() {
    long c = names.stream()
        .count();
    System.out.println(c);
  }


  private void populateNames() {
    names.add("Joe");
    names.add("Anthony");
    names.add("Seth");
    names.add("Mike");
    names.add("Rob");
    names.add("Aron");
    names.add("Chris");
  }

  private void populateNumbers() {
    numbers.add(56);
    numbers.add(67);
    numbers.add(1);
    numbers.add(20);
    numbers.add(11);
    numbers.add(35);
  }

}
