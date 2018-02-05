package designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Catetaker {

  private List<Memento> ledTvList = new ArrayList<>();

  public void addMemento( Memento m) {

    ledTvList.add(m);
    System.out.println("Led TV snapshot maintained by careTakes : " + ledTvList);

  }


  public Memento getMemento (int index) {
    return ledTvList.get(index);
  }

}
