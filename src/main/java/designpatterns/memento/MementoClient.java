package designpatterns.memento;

public class MementoClient {

  public static void main(String[] args) {
    Originator originator = new Originator();
    originator.setLedTV(new LedTV("42 inch","1000 bucks", false));

  Catetaker catetaker = new Catetaker();
  catetaker.addMemento(originator.createMemento());

    originator.setLedTV(new LedTV("46 inch","1200 bucks", true));
    catetaker.addMemento(originator.createMemento());

    originator.setLedTV(new LedTV("50 inch","1300 bucks", true));

    System.out.println("Originator current status" + originator);

    System.out.println("Restoring originator to 42 inch");
    originator.setMemento(catetaker.getMemento(0));

    System.out.println("Originator current state" + originator);

  }

}