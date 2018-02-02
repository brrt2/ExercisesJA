package javaNotesForPorfessonals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExercises {

  public static void main(String[] args) {

// Count occurrences of each String
    Stream.of("Apple", "Banana", "Orange", "Lemon", "Apple", "Orange")
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
        .forEach(System.out::println);

    // Infinite IntStream

//    IntStream infiniteStream = IntStream.iterate(1, x -> x + 1);
//    infiniteStream.limit(10).forEach(System.out::println);

    List<Integer> generatedStream = Stream.generate(Math::random)
        .limit(10)
        .map(x -> x * 10)
        .mapToInt(Double::intValue)
        .boxed()
        .collect(Collectors.toList());


    generatedStream.forEach(System.out::println);

//    generatedStream.limit(10).forEach(System.out::println);

    // Collecting  to as string
    System.out.println(Arrays
        .asList("alfombra", "alcantarilla", "casa", "domestico", "coche", "botella")
        .stream()
        .filter(x -> x.contains("c"))
        .collect(Collectors.toList())
    );

    List<String> strings = new ArrayList<>();
    strings.add("blabla");
    strings.add("aaa");

    // Creating a new Collection with method references

    System.out.println(strings
        .stream()
        .filter(s -> s != null && s.length() <= 3)
        .collect(Collectors.toCollection((Supplier<ArrayList<String>>) ArrayList::new))
    );

    System.out.println(strings
        .stream()
        .filter(s -> s != null && s.length() <= 3)
        .collect(Collectors.toCollection((Supplier<LinkedHashSet<String>>) LinkedHashSet::new))
    );

    List<Student> students = new ArrayList<>();
    students.add(new Student(1, "student1"));
    students.add(new Student(2, "test2"));
    students.add(new Student(3, "student3"));

    Map<Integer, String> IdToName = students.stream()
        .collect(Collectors.toMap(Student::getId, Student::getName));
    System.out.println(IdToName);


    List<Student> list = new ArrayList<>();
    list.add(new Student(5, "David" , SUBJECT.MATH));
    list.add(new Student(2, "John" , SUBJECT.MATH));
    list.add(new Student(2, "John" , SUBJECT.GEOGRAPHY));
    list.add(new Student(2, "John" , SUBJECT.SCIENCE));
    list.add(new Student(5, "David" , SUBJECT.SCIENCE));

    Map<String, List<SUBJECT>> map = new HashMap<>();
    list.stream().forEach(s -> {
      map.computeIfAbsent(s.getName(), x -> new ArrayList<>()).add(s.getSubject());
    });
    System.out.println(map);

    sumDigits("12345");

  }

  private static void sumDigits(String s) {

    int sum = Arrays
        .stream(s.split("")) // Convert to an array
        .mapToInt(Integer::parseInt)  // Convert to Integers
        .sum(); // Sum
    System.out.println(sum);

  }
}
