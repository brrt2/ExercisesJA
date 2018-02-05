package recruitmentExercises;

import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E> {
  MyNode root;
  int size;

  public MyLinkedList() {
    root = new MyNode();
    size = 0;
  }

  // Test code - main function
//  public static void main(String[] args) {
//    LinkedList ll = new LinkedList();
//    System.out.println(ll.getSize());
//    ll.add(8);
//    System.out.println(ll.getSize());
//    ll.add(17);
//    ll.add(5);
//    ll.add(10);
//    System.out.println(ll.find(17).getData());
//    ll.remove(5);
//    System.out.println(ll.getSize());
//    System.out.println(ll.find(5));
//  }

  public void setSize(int s) {
    this.size = s;
  }

  public int getSize() {
    return this.size;
  }

  public MyNode add(E item) {
    MyNode newMyNode = new MyNode(item, root);
    this.root = newMyNode;
    this.size++;
    return newMyNode;
  }

  public MyNode find(E item) {
    MyNode thisMyNode = this.root;

    while (thisMyNode != null) {
      if (thisMyNode.getItem().equals(item))
        return thisMyNode;
      thisMyNode = thisMyNode.getNextMyNode();
    }
    return null;
  }

  public boolean remove(E item) {
    MyNode thisMyNode = this.root;
    MyNode prevMyNode = null;

    while (thisMyNode != null) {
      if (thisMyNode.getItem().equals(item)) {
        if (prevMyNode != null)
          prevMyNode.setNextMyNode(thisMyNode.getNextMyNode());
        else
          this.root = null;
        this.setSize(this.getSize()-1);
        return true;
      }
      prevMyNode = thisMyNode;
      thisMyNode = thisMyNode.getNextMyNode();
    }
    return false;
  }

  @Override
  public Iterator<E> iterator() {
    return null;
  }

  // MyNode class
  private class MyNode<E> {
    E item;
    private MyNode nextMyNode;

    // 0-arg constructor, 1-arg constructor, 2-arg constructor
    private MyNode() { }

    private MyNode(E item) {
      this.item = item;
    }

    private MyNode(E item, MyNode next) {
      nextMyNode = next;
      this.item = item;
    }

    private void setNextMyNode(MyNode n) {
      this.nextMyNode = n;
    }

    private MyNode getNextMyNode() {
      return this.nextMyNode;
    }

    public E getItem() {
      return item;
    }

    public void setItem(E item) {
      this.item = item;
    }
  }
}