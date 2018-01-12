package java8mito.ReferanciasDeMetodos;

import java.util.Arrays;
import java.util.List;

public class Persona {

  String name;
  int age;


  public void showNames() {
    String[] names = {"Alvaro","Ricardo","Guillermo","Pepe"};
    Arrays.sort(names,String::compareTo);
    Arrays.asList(names).forEach(System.out::println);
  }

  public static void introduceYourself() {
    System.out.println("Hola, q tal ?");
  }

  public void introduce(){
    System.out.println("Hola soy " + name + " y tengo " + age);
  }




  public Persona(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Persona{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

}
