package java8mito.ForEachRemoveIfSort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex {

  private List<String> lista = new ArrayList<>();


  public static void main(String[] args) {

  Ex ex = new Ex();
  ex.usarForEach();
  ex.usarRemoveIf();
  ex.usarSort();

  }

  private void usarForEach() {
    lista.add("AAAA");
    lista.add("Dafdfs");
    lista.add("Cfdfsfs");
    lista.add("ZCZffsdfdsdfsfs");
    lista.add("ytytytgdgfd");
    lista.add("ZZZZZZZZZ");

    for(String elemento : lista) {
      System.out.println(elemento);
    }

    lista.forEach(System.out::println);

  }

  private void usarRemoveIf() {

    Iterator<String> it = lista.iterator();

    while(it.hasNext()) {
      if(it.next().equals("AAAA")) {
        it.remove();
      }
    }

//    lista.removeIf(p->p.equals("AAAA"));
  lista.forEach(System.out::println);
  }

  private void usarSort() {
    lista.sort(String::compareToIgnoreCase);
    lista.forEach(System.out::println);
  }









}
